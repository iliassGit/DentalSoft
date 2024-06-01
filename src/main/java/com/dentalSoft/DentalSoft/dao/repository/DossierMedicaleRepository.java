package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.Dentiste;
import com.dentalSoft.DentalSoft.dao.entity.DossierMedicale;
import com.dentalSoft.DentalSoft.services.DossierMedicaleService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierMedicaleRepository extends CrudRepository<DossierMedicale, Long> {
    DossierMedicale findDossierMedicaleByPatientId(Long id);
}
