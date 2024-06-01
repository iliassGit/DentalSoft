package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.DossierMedicale;
import com.dentalSoft.DentalSoft.dao.entity.SituationFinanciere;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituationFinanciereRepository extends CrudRepository<SituationFinanciere, Long> {
    SituationFinanciere findByDossierMedicale(DossierMedicale dossierMedicale);
}
