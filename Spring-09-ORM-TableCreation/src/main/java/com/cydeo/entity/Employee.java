package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee { // creates employee table

    @Id
    private  int id; // column its primary key
    private String name;
}
