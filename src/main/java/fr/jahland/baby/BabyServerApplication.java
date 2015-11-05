package fr.jahland.baby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@PropertySource("classpath:application.properties")
@SpringBootApplication
@EnableMongoRepositories
public class BabyServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(BabyServerApplication.class, args);
    }
}
