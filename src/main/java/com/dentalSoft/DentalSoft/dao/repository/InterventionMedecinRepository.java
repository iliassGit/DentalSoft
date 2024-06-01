package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.Consultation;
import com.dentalSoft.DentalSoft.dao.entity.InterventionMedecin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface InterventionMedecinRepository extends CrudRepository<InterventionMedecin, Long> {
    List<InterventionMedecin> findByConsultation(Consultation consultation);
}
