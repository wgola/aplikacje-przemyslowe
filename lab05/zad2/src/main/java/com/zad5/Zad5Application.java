package com.zad5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Zad5Application {

	public static void main(String[] args) {
		SpringApplication.run(Zad5Application.class, args);
	}

}
