package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {



    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigApp.class);


        Java bean = context.getBean(Java.class);
        bean.getTeachingHours();

        ApplicationContext context1= new AnnotationConfigApplicationContext(ConfigApp.class);

        Selenium bean1 = context1.getBean(Selenium.class);

        bean1.getTeachingHours();


    }

}
