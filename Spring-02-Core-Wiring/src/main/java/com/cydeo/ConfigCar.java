package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car (){
       Car car= new Car();
       car.setMake("Honda");
       return car;
    }
/*
    @Bean
    Person person(){
        Person p= new Person();
        p.setName("Cameron");
        p.setCar(car());// wiring calling the bean into another direct wiring
        return p;
    }

 */
    Person person (Car car){
        Person p= new Person();
        p.setName("Cameron");
        p.setCar(car());// auto wiring since I have it in the argument
        return p;
    }
}
