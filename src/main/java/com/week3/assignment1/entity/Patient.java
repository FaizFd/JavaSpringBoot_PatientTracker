package com.week3.assignment1.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity  // This annotation marks it as a JPA entity
@Table(name = "patients")  // Specify the table name if it differs from the class name
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Automatically increments the id
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String email;
    private String city;
    private LocalDate dateOfBirth;
}
