package com.cydeo.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ConfigCourse.class);
Agile agile=applicationContext.getBean(Agile.class);
agile.getTeachingHours();
Jav jav=applicationContext.getBean(Jav.class);
jav.getTeachingHours();
    }



}
