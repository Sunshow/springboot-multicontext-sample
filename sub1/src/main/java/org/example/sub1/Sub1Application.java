package org.example.sub1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:sub1.properties")
public class Sub1Application {

    public static void main(String[] args) {
        new SpringApplication(Sub1Application.class).run(args);
    }

}
