package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean
    PracFullTimeEmployee fullTimeEmployee(){

        return new PracFullTimeEmployee();
    }

    @Bean
    PracPartTimeEmployee pracPartTimeEmployee(){

        return new PracPartTimeEmployee();
    }



}
