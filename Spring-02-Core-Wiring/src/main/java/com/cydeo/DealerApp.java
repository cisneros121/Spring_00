package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DealerApp {

    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c=context.getBean(Car.class);
        System.out.println(c.getMake());
        Person p=context.getBean(Person.class);
        System.out.println(p.getName());
        System.out.println("person's car: "+p.getCar());

    }
}
