package com.cursova.oksana.kn.dao;


import com.cursova.oksana.kn.model.Profession;

import java.util.List;

public interface ProfessionDAO {
    int avgProfessionRating();
    List<Profession> sortByRating();
}
