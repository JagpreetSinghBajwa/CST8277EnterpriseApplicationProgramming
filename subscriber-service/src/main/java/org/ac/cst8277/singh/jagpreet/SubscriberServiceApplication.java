package org.ac.cst8277.singh.jagpreet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SubscriberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriberServiceApplication.class, args);
	}

	@Bean
	public Docket api() {
		return (new Docket(DocumentationType.SWAGGER_2)).select().apis(RequestHandlerSelectors.any()).build();
	}
}
