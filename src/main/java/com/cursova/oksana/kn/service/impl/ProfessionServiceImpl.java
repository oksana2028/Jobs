package com.cursova.oksana.kn.service.impl;

import com.cursova.oksana.kn.dao.impl.ProfessionDAOImpl;
import com.cursova.oksana.kn.model.Profession;
import com.cursova.oksana.kn.service.CRUDService;
import com.cursova.oksana.kn.service.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProfessionServiceImpl  implements CRUDService<Profession>, ProfessionService {
    private final ProfessionDAOImpl professionDAO;

    @Autowired
    public ProfessionServiceImpl(ProfessionDAOImpl professionDAO) {
        this.professionDAO = professionDAO;
    }

    @Override
    public Profession findById(int id) {
        return professionDAO.findById(id);
    }

    @Override
    public List<Profession> findAll() {
        return professionDAO.findAll();
    }

    @Override
    public Profession create(Profession profession) {
        profession.setCreatedAt(LocalDate.now());
        return professionDAO.create(profession);
    }

    @Override
    public Profession update(Profession profession) {
        return professionDAO.update(profession);
    }

    @Override
    public void deleteById(int id) {
        professionDAO.deleteById(id);
    }

    @Override
    public int avgProfessionRating() {
        return professionDAO.avgProfessionRating();
    }

    @Override
    public Profession findByRating(int rating) {
        return null;
    }
}
