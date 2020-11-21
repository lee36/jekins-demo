package com.lee.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoApplication {

    @RequestMapping("/demo")
    public Object demo(){
        int i=10/0;
        String aa="你好";
        return "jekins-demo";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoApplication.class, args);
    }

}
