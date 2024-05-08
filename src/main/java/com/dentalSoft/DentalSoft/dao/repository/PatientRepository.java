package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.Patient;
import org.springframework.data.repository.CrudRepository;



public interface PatientRepository extends CrudRepository<Patient, Long> {

}
