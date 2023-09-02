package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxyInterface;
import com.cydeo.proxy.PushNotificationProxy;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
private final CommentNotificationProxyInterface  commentNotificationProxyInterface;


    public CommentService(CommentRepository commentRepository,@Qualifier("push") CommentNotificationProxyInterface commentNotificationProxyInterface) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxyInterface = commentNotificationProxyInterface;

    }


    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxyInterface.sendComment(comment);

    }


}
