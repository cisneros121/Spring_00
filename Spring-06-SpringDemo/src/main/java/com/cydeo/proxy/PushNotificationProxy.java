package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("push")
public class PushNotificationProxy implements CommentNotificationProxyInterface{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification: "+comment.getText());
    }
}
