package com.cydeo.stereotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class Agile {

    public void getTeachingHours(){
        System.out.println("teaching hours=15");
    }

}
