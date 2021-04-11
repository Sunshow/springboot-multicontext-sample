package org.example.container;

import org.example.container.config.RootConfig;
import org.example.sub1.Sub1Application;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class ContainerSpringApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder rootBuilder = new SpringApplicationBuilder(RootConfig.class);
        //.parent(ContainerSpringApplication.class);

        //rootBuilder.run(args);

        SpringApplicationBuilder sub1Builder = rootBuilder.child(Sub1Application.class);

        sub1Builder.run(args);
    }

}
