package com.cursova.oksana.kn.service.impl;

import com.cursova.oksana.kn.dao.impl.UserDAOImpl;
import com.cursova.oksana.kn.model.Role;
import com.cursova.oksana.kn.model.User;
import com.cursova.oksana.kn.service.CRUDService;
import com.cursova.oksana.kn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class UserServiceImpl implements CRUDService<User>, UserService {

    private final UserDAOImpl userDAO;

    @Autowired
    public UserServiceImpl(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User create(User user) {
        user.setCrearedAt(LocalDate.now());
        return userDAO.create(user);
    }

    @Override
    public User update(User user) {
        return userDAO.update(user);
    }

    @Override
    public void deleteById(int id) {
        userDAO.deleteById(id);
    }

    @Override
    public int avgUserAge() {
        return userDAO.avgUserAge();
    }

    @Override
    public User findByEmail(String email) {
        return userDAO.findByEmail(email);
    }
}
