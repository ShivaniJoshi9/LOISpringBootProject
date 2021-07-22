package com.training.secondspring.mongodb.service;

import com.training.secondspring.mongodb.model.LOIChampion;
import com.training.secondspring.mongodb.repository.LOIRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class LOIServiceTest {
    @Autowired
    LOIService testService;

    //mocking the repository here
    @MockBean
    private LOIRepository testRepository;

    @Test
    public void testLOIServicefindAll() {
        List<LOIChampion> champions = new ArrayList<LOIChampion>();
        LOIChampion champion = new LOIChampion();
        champion.setId("1234");
        champion.setName("test");
        champion.setRole("something");
        champion.setDifficulty("hard");
        champions.add(champion);

        when(testRepository.findAll()).thenReturn(champions);
        assertEquals(1, testService.findAll().size());
    }
}
