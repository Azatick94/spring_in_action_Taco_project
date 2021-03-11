package com.example.spring_in_action_taco_1;

import com.example.spring_in_action_taco_1.configuration.WebConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.containsString;

@WebMvcTest
@ContextConfiguration(classes = {WebConfig.class, SpringInActionTaco1Application.class})
class HomeControllerTest {

    // For testing requests @WebMvcTest Annotation should be used
    @Autowired
    private MockMvc mockMvc;

    /**
     * @throws Exception From that request, it sets the following expectations:
     *                   The response should have an HTTP 200 (OK) status.
     *                   The view should have a logical name of home.
     *                   The rendered view should contain the text “Welcome to....”
     */
    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("home"))
                .andExpect(content().string(
                        containsString("Welcome to...")));

    }
}