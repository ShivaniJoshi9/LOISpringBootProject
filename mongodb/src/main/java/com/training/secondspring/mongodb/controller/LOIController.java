package com.training.secondspring.mongodb.controller;

import com.training.secondspring.mongodb.model.LOIChampion;
import com.training.secondspring.mongodb.service.LOIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/v1/loi")
public class LOIController {

    @Autowired
    LOIService service;

    @GetMapping
    public List<LOIChampion> findAll(){
        return service.findAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<LOIChampion> findById(@PathVariable String id){
        try {
            return new ResponseEntity<LOIChampion>(service.findById(id).get(), HttpStatus.OK);
        } catch(NoSuchElementException e){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public LOIChampion save(LOIChampion champion){
        return service.save(champion);
    }
    @PutMapping
    public LOIChampion update(LOIChampion champion){
        return service.update(champion);
    }
    @DeleteMapping
    public void delete(LOIChampion champion){
        service.delete(champion);
    }
}
