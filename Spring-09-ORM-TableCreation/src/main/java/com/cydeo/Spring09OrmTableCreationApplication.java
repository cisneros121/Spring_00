package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.cydeo.entity")
public class Spring09OrmTableCreationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring09OrmTableCreationApplication.class, args);
    }

}
