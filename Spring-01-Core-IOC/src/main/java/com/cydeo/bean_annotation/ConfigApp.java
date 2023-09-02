package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

//method that is return the object into a bean with the below annotation
    @Bean
    FullTimeMentor fullTimeMentor(){
        return new FullTimeMentor();
    }

    @Bean(name = "p1")
   PartTimeMentor partTimeMentor(){
        return new PartTimeMentor();
    }

//@Bean(name = "p2")
    @Bean
    @Primary // this is the default bean no need to give name
    PartTimeMentor partTimeMentor2(){//Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException:
  //  No qualifying bean of type 'com.cydeo.bean_annotation.PartTimeMentor' available: expected single matching bean but found 2: partTimeMentor,partTimeMentor2

        return new PartTimeMentor();
    }







}
