package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.Facture;
import com.dentalSoft.DentalSoft.dao.entity.SituationFinanciere;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {
    List<Facture> findBySituationFinanciere(SituationFinanciere situationFinanciere);

}
