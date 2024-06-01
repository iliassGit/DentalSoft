package com.dentalSoft.DentalSoft.dao.repository;

import com.dentalSoft.DentalSoft.dao.entity.AntecedentsMedicaux;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AntecedentsMedicauxRepository extends CrudRepository<AntecedentsMedicaux, Long> {

}
