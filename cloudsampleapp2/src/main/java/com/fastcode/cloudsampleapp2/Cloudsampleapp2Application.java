package com.fastcode.cloudsampleapp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fastcode.cloudsampleapp2"})
public class Cloudsampleapp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cloudsampleapp2Application.class, args);
	}

}

