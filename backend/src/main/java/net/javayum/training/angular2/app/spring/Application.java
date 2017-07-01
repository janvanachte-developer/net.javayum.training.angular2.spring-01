package net.javayum.training.angular2.app.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main (String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
    }
}
