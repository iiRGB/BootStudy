package org.tis.bootstudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 *
 * @author zhaoch
 * @date 2018/4/19
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }
}
