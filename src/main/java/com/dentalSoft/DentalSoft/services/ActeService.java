package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.Acte;
import com.dentalSoft.DentalSoft.dao.entity.Patient;
import com.dentalSoft.DentalSoft.dao.repository.ActeRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActeService {
    @Autowired
    ActeRepository acteRepository;
    public Acte findById(Long id){
        return acteRepository.findById(id).orElse(null);
    }
    public void save(Acte acte){

        acteRepository.save(acte);
    }
    public Acte findLastId() {
        List<Acte> actes = (List<Acte>) acteRepository.findAll();
        return  actes.get(actes.size() - 1);
    }
}
