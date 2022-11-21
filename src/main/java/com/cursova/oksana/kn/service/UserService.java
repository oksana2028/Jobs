package com.cursova.oksana.kn.service;

import com.cursova.oksana.kn.model.User;

import java.util.List;

public interface UserService {
    int avgUserAge();

    User findByEmail(String email);

}
