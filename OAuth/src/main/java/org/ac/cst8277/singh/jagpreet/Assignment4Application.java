package org.ac.cst8277.singh.jagpreet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;


@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableResourceServer
public class Assignment4Application {

    public static void main(String[] args) {
        SpringApplication.run(Assignment4Application.class, args);
    }

}
