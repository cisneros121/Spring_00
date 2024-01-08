package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee { // creates employee table

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id; // column its primary key
    private String name;
}
