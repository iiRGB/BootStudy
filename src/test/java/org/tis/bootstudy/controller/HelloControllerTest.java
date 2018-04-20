package org.tis.bootstudy.controller;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.RequestBuilder;
import org.tis.bootstudy.BootStudyApplicationTests;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class HelloControllerTest extends BootStudyApplicationTests {

    @Test
    public void hello() throws Exception {
        RequestBuilder request = null;
        request = get("/hello")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .accept(MediaType.APPLICATION_JSON);
        mvc.perform(request)
                .andExpect(content().string(equalTo("Hello world!")));
    }
}