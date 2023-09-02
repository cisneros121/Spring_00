package com.cydeo;

import com.cydeo.config.ProjectConfigClass;
import com.cydeo.model.Comment;
import com.cydeo.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        Comment comment = new Comment();

        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context= new AnnotationConfigApplicationContext(ProjectConfigClass.class);
        CommentService service=context.getBean(CommentService.class);
        service.publishComment(comment);
    }
}
