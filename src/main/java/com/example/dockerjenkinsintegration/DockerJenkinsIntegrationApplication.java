package com.example.dockerjenkinsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class DockerJenkinsIntegrationApplication {

    @GetMapping
    public String getWelcome(){
        return "Welcome Spring Boot Testing";
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
    }

}
