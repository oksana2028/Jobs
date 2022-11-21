package com.cursova.oksana.kn.service;

import java.util.List;

public interface CRUDService<T> {
    T findById(int id);


    List<T> findAll();

    T create(T t);

    T update(T t);

    void deleteById(int id);
}
