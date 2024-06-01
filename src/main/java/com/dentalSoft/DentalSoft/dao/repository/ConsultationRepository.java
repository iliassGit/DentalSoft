package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.Consultation;
import com.dentalSoft.DentalSoft.dao.entity.DossierMedicale;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultationRepository extends CrudRepository<Consultation, Long> {
    public List<Consultation> findByDossierMedicale(DossierMedicale dm);
}
