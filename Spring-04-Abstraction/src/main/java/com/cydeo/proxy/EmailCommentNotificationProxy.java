package com.cydeo.proxy;

import com.cydeo.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxyInterface{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("sending notification for comment: "+comment.getText());
    }



}
