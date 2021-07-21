package com.training.secondspring.mongodb.service;

import com.training.secondspring.mongodb.model.LOIChampion;

import java.util.List;
import java.util.Optional;

public interface Service {

    public List<LOIChampion> findAll();

    public Optional<LOIChampion> findById(String id);

    public LOIChampion save(LOIChampion champion);

    public LOIChampion update(LOIChampion champion);

    public void delete(LOIChampion champion);
}