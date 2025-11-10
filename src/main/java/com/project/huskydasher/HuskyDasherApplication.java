package com.project.huskydasher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HuskyDasherApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuskyDasherApplication.class, args);
    }

}
