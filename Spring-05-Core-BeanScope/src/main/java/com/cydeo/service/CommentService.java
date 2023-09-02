package com.cydeo.service;

import com.cydeo.model.Comment;
import com.cydeo.proxy.CommentNotificationProxyInterface;
import com.cydeo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)//can write prototype instead
@Lazy // lazy does not instantiates it till I request it
public class CommentService {

    private final CommentRepository commentRepository;
private final CommentNotificationProxyInterface  commentNotificationProxyInterface;


    public CommentService(CommentRepository commentRepository, @Qualifier("push") CommentNotificationProxyInterface commentNotificationProxyInterface) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxyInterface = commentNotificationProxyInterface;
        System.out.println("hello");

    }


    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxyInterface.sendComment(comment);

    }


}
