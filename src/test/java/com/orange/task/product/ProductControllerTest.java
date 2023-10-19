package com.orange.task.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@ActiveProfiles({"test"})
@SpringBootTest
@AutoConfigureMockMvc
class ProductControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldReturnNoProducts() throws Exception {
        this.mockMvc.perform(get("/v1/products/")).andDo(print()).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(content().json("[]"));
    }

    @Test
    void shouldCreateAProduct() throws Exception {
        // TODO implement test
    }
}
