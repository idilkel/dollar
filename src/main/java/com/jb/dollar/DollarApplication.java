package com.jb.dollar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableScheduling
@EnableSwagger2
public class DollarApplication {

    public static void main(String[] args) {
        SpringApplication.run(DollarApplication.class, args);
        System.out.println("Monolith is up");
    }

}
