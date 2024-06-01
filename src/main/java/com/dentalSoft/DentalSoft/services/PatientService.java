package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.Dentiste;
import com.dentalSoft.DentalSoft.dao.entity.Patient;
import com.dentalSoft.DentalSoft.dao.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;


    public Iterable<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public boolean findByCin(String cin) {
        return patientRepository.findByCin(cin);
    }
    public void savePatient(Patient patient) {

        patientRepository.save(patient);
    }

    public Patient findLastId() {
        List<Patient> patients = (List<Patient>) patientRepository.findAll();
        return  patients.get(patients.size() - 1);
    }

    public void deletePatientById(Long id){
        patientRepository.deleteById(id);
    }

    public Patient findPatientById(Long id){
        return patientRepository.findPatientById(id);
    }
}
