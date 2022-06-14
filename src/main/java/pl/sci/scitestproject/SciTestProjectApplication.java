package pl.sci.scitestproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pl.sci")
public class SciTestProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SciTestProjectApplication.class, args);
    }
}

