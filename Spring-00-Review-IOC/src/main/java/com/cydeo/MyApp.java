package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);

        PracFullTimeEmployee bean = context.getBean(PracFullTimeEmployee.class);

        bean.createAccount();

        PracPartTimeEmployee bean2=context.getBean(PracPartTimeEmployee.class);

    }



}
