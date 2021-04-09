package org.example.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ContainerSpringApplication extends SpringApplication {

    public ContainerSpringApplication(Class<?>... classes) {
        super(classes);
    }

    public static void main(String[] args) {
        new ContainerSpringApplication(ContainerSpringApplication.class).run(args);
    }

    @Override
    protected ConfigurableApplicationContext createApplicationContext() {
        ConfigurableApplicationContext parent = super.createApplicationContext();

        return parent;
    }

}
