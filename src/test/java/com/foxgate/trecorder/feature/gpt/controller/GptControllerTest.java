package com.foxgate.trecorder.feature.gpt.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class GptControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void testTheTest() throws Exception {
        mockMvc.perform(get("/api/gpt/test"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"));

    }
}