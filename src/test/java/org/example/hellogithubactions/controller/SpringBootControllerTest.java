package org.example.hellogithubactions.controller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(SpringBootController.class)
class SpringBootControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @BeforeEach
    void setUp() {}

    @AfterEach
    void tearDown() {}

    @Test
    public void testWelcome() throws Exception {
        mockMvc.perform(get("/welcome")) //Perform en get-request til /welcome
                .andExpect(status().isOk()) //Forventer succes 200 OK
                .andExpect(view().name("welcome")); //Forventer view-navn 'welcome'
    }
}