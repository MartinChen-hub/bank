package com.vb.bank.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(BankController.class)
@ContextConfiguration(classes={BankController.class})
public class BankControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void test() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        headers.add("accept", "application/json");
        headers.add("Content-Type", "application/json");
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/bank/all").contentType(
                MediaType.APPLICATION_JSON
        ).headers(headers);
        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"012\":\"China Bank Hong Kong\",\"391\":\"Welab Bank\"}")).andReturn();
    }
}
