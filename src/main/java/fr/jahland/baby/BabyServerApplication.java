package fr.jahland.baby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@SpringBootApplication
public class BabyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BabyServerApplication.class, args);
    }
}
