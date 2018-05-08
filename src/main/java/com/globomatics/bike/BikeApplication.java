package com.globomatics.bike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@Configuration
@PropertySource(value = {"file:${appprop}"})
public class BikeApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BikeApplication.class);
    }

	public static void main(String[] args) {
	    try {
            System.out.println("========================================");
            System.out.println("ExtE: " + System.getenv("appprop"));
            System.out.println("ExtP: " + System.getProperty("app_prop"));
            System.out.println("========================================");
        }catch (Exception e){
           System.out.println(e);
        }

		SpringApplication.run(BikeApplication.class, args);
	}
}
