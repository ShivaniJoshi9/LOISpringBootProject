package com.training.secondspring.mongodb.model;

import org.junit.jupiter.api.Test;

public class LOIChampionTest {
    @Test
    public void testLOIChampionGettersandSetters(){
        LOIChampion testChampion = new LOIChampion();
        testChampion.setId("7");
        testChampion.setName("Aphelios");
        testChampion.setRole("Marksman");
        testChampion.setDifficulty("Difficult");

        assert (testChampion.getId().equals("7"));
        assert (testChampion.getName().equals("Aphelios"));
        assert (testChampion.getRole().equals("Marksman"));
        assert (testChampion.getDifficulty().equals("Difficult"));

    }
}
