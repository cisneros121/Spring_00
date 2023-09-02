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
/*
        CommentService cs= context.getBean(CommentService.class); // the same instance
        CommentService cs2= context.getBean(CommentService.class);// same instance this is default need to use prototype scope for that

        System.out.println(cs==cs2); //false if I define scope as prototype or true if I dont define

 */
    }
}
