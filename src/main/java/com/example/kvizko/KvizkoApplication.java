package com.example.kvizko;

import jakarta.persistence.EntityManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class KvizkoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KvizkoApplication.class, args);
    }

    /*@Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }*/

}
