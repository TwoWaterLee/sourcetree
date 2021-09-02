package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author liershui
 * @date 2021/5/10 11:45 上午
 */
 @RestController
 @SpringBootApplication
public class MainApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    
    public static void main(String[] args) {
       SpringApplication.run(MainApplication.class, args);
    }
}
