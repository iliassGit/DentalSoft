package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.Facture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {
}
