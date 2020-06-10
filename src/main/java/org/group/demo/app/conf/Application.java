package org.group.demo.app.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.ssaad.ami", "org.group.demo.app"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
