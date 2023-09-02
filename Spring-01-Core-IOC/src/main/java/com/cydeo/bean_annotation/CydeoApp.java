package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);


FullTimeMentor ft=context.getBean(FullTimeMentor.class);

ConfigAny configAny = context.getBean(ConfigAny.class);

        System.out.println(configAny);

        String string=context.getBean(String.class);

        System.out.println(string);

        ft.createAccount();


//PartTimeMentor partTimeMentor= context.getBean("p2",PartTimeMentor.class); // can pass the name to specify the bean

        PartTimeMentor partTimeMentor= context.getBean(PartTimeMentor.class);
        PartTimeMentor partTimeMentor1= context.getBean("p1",PartTimeMentor.class);

partTimeMentor.createAccount();
partTimeMentor1.createAccount();





    }
}
