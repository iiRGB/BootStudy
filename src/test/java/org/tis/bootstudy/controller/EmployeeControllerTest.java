package org.tis.bootstudy.controller;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.RequestBuilder;
import org.tis.bootstudy.BootStudyApplicationTests;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class EmployeeControllerTest extends BootStudyApplicationTests {

    @Test
    public void add() throws Exception {
        RequestBuilder request;
        String requestBody = " {\"id\": \"1\", \"name\": \"员工1\"}";
        // 1、get查一下user列表，应该为空
        request = post("/emp/add")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(requestBody)
                .accept(MediaType.APPLICATION_JSON);
        mvc.perform(request)
                .andExpect(content().string(equalTo("新增成功！")));
    }

}