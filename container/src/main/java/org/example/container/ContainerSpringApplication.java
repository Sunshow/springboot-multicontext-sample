package org.example.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ContainerSpringApplication extends SpringApplication {

    public static void main(String[] args) {
        run(ContainerSpringApplication.class, args);
    }

    @Override
    protected ConfigurableApplicationContext createApplicationContext() {
        return super.createApplicationContext();
    }

}
