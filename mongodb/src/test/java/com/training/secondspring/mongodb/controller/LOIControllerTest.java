package com.training.secondspring.mongodb.controller;

import com.training.secondspring.mongodb.model.LOIChampion;
import com.training.secondspring.mongodb.service.LOIService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(LOIController.class)
public class LOIControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private LOIService testService;

    @Test
    public void testLOIServicefindAll() throws Exception {
        List<LOIChampion> champions = new ArrayList<LOIChampion>();
        LOIChampion champion = new LOIChampion();
        champion.setId("1234");
        champion.setName("test");
        champion.setRole("something");
        champion.setDifficulty("hard");
        champions.add(champion);

        when(testService.findAll()).thenReturn(champions);

        this.mockMvc.perform(get("/api/v1/loi"))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect(MockMvcResultMatchers.content().string(containsString("\"id\":\"1234\"")));
    }
}
