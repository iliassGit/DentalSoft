package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

    Boolean findByCin(String cin);
    Patient save(Patient patient);
    void deletePatientById(Long id);
    Patient findPatientById(Long id);
}
