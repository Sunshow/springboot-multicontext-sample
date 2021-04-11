package org.example.container.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * author: sunshow.
 */
@SpringBootApplication
@PropertySource("classpath:root.properties")
public class RootConfig {
}
