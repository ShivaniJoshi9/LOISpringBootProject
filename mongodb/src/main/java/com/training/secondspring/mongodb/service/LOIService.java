package com.training.secondspring.mongodb.service;

import com.training.secondspring.mongodb.model.LOIChampion;
import com.training.secondspring.mongodb.repository.LOIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class LOIService implements Service{

    @Autowired
    private LOIRepository repository;

    @Override
    public List<LOIChampion> findAll() {
        return repository.findAll();
    }
    @Override
    public Optional<LOIChampion> findById(String id) {
        return repository.findById(id);
    }
    @Override
    public LOIChampion save(LOIChampion champion) {
        return repository.save(champion);
    }
    @Override
    public LOIChampion update(LOIChampion champion) {
        return repository.save(champion);
    }
    @Override
    public void delete(LOIChampion champion){
        repository.delete(champion);
    }
}
