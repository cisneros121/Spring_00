package com.cydeo.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    private String firstName;
    private String lastName;
    private String email;

    @Id
    private Long id;
}
