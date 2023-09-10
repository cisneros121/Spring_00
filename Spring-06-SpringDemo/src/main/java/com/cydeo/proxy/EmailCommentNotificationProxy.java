package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailCommentNotificationProxy implements CommentNotificationProxyInterface{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending notification for comment: "+comment.getText());
    }



}
