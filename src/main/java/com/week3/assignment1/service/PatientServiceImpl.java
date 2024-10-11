package com.week3.assignment1.service;

import com.week3.assignment1.entity.Patient;
import com.week3.assignment1.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();  // Fetch all patients from the database
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);  // Save the patient entity
    }

    @Override
    public void updatePatient(Long id, Patient patient) {
        if (patientRepository.existsById(id)) {
            patient.setId(id);
            patientRepository.save(patient);  // Update the patient entity
        }
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.deleteById(id);  // Delete patient by id
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);  // Fetch patient by id
    }

    @Override
    public List<Patient> getPatientsByName(String name) {
        return patientRepository.findByNameContainingIgnoreCase(name);  // Use the custom query method
    }
}
