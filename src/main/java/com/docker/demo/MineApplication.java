package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // 요거 추가
public class MineApplication {
    public static void main(String[] args) {
        SpringApplication.run(MineApplication.class, args);
    }

    @GetMapping("/") // 요거랑 아래 메서드 추가
    public String home() {
        return "Hello, Docker world!";
    }
}
