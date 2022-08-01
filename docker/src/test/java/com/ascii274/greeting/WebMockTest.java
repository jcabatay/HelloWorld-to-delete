package com.ascii274.greeting;

import com.ascii274.greeting.controller.GreetingController2;
import com.ascii274.greeting.service.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreetingController2.class)
public class WebMockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GreetingService greetingService;

    @Test
    public void greetingReturnMessageFromService() throws Exception {
        when(greetingService.hello()).thenReturn("Hello, docker");
        this.mockMvc.perform(get("/hellodocker/v2/hello-webmock")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, docker")));
    }

}
