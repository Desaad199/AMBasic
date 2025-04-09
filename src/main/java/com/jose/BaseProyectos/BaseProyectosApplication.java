package com.jose.BaseProyectos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jose.BaseProyectos")
public class BaseProyectosApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseProyectosApplication.class, args);
	}

}
