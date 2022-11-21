package com.cursova.oksana.kn.dao.impl;

import com.cursova.oksana.kn.dao.DAO;
import com.cursova.oksana.kn.dao.ProfessionDAO;
import com.cursova.oksana.kn.model.Profession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfessionDAOImpl implements DAO<Profession>, ProfessionDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public ProfessionDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Profession findById(int id) {
        return sessionFactory.openSession().get(Profession.class, id);
    }

    @Override
    public List<Profession> findAll() {
        Session session = sessionFactory.openSession();
        return session.createQuery("SELECT a FROM Profession a", Profession.class).getResultList();
    }

    @Override
    public Profession create(Profession profession) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(profession);
        transaction.commit();
        session.close();
        return profession;
    }

    @Override
    public Profession update(Profession profession) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(profession);
        transaction.commit();
        session.close();
        return profession;
    }

    @Override
    public void deleteById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Profession profession = session.get(Profession.class, id);
        session.delete(profession);
        transaction.commit();
        session.close();
    }

    @Override
    public int avgProfessionRating() {
        Session session = sessionFactory.openSession();
        double avgRating = (double) session.createQuery("select avg (rating) from Profession ").getSingleResult();
        return (int) avgRating;
    }

    @Override
    public List<Profession> sortByRating() {
        return null;
    }
}
