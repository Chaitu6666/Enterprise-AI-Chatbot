package com.AI.Ollama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.AI.Ollama")
public class OllamaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OllamaApplication.class, args);
    }

}