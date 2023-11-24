package com.stepik.zad3;

import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Zad3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Zad3Application.class, args);
		Stream.of(context.getBeanDefinitionNames())
				.map(context::getBean)
				.forEach(System.out::println);
	}
}
