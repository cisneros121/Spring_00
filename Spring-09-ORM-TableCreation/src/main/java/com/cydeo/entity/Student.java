package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {
    @Column(name = "studentFirstName")
    private String firstName;
    @Column(name = "studentLastName")

    private String lastName;
    @Column(name = "studentEmail")

    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Transient
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthday;
@Column(columnDefinition = "TIME")
    private LocalDate birthTime;

@Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateTime;

@Enumerated(EnumType.STRING)
private Gender gender;
}
