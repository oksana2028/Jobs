package com.cursova.oksana.kn.dao;

import com.cursova.oksana.kn.model.User;

public interface UserDAO {
    User findBySurname(String surname);

    int avgUserAge();

    User findByEmail(String email);
}
