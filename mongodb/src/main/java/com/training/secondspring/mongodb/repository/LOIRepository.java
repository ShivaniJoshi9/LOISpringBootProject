package com.training.secondspring.mongodb.repository;

import com.training.secondspring.mongodb.model.LOIChampion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LOIRepository extends MongoRepository<LOIChampion, String> {

}
