package com.cursova.oksana.kn.service;

import com.cursova.oksana.kn.model.Profession;

public interface ProfessionService {
    Profession findByRating(int rating);
    int avgProfessionRating();
}
