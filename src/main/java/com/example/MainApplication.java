package com.example;

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
