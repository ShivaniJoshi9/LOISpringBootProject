package com.training.secondspring.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class LOIChampion {
    @Id
    private String id;
    private String name;
    private String role;
    private String Difficulty;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDifficulty() {
        return Difficulty;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDifficulty(String difficulty) {
        Difficulty = difficulty;
    }
}
