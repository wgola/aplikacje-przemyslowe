package com.stepik.zad4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Zad4Application {

	public static void main(String[] args) {
		SpringApplication.run(Zad4Application.class, args);
	}
}
