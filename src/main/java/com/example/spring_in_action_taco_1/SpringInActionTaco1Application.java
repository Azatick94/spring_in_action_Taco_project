package com.example.spring_in_action_taco_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringInActionTaco1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringInActionTaco1Application.class, args);
    }

}
