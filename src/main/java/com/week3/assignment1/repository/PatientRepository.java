package com.week3.assignment1.repository;

import com.week3.assignment1.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    
    List<Patient> findByNameContainingIgnoreCase(String name);  // Custom query method
}
