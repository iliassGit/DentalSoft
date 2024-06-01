package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.Caisse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaisseRepository extends CrudRepository<Caisse, Long> {
}
