package com.stepik.zad1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Zad1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Zad1Application.class, args);
		MathApplication mathApplication = context.getBean(MathApplication.class);

		System.out.println("2+2=" + mathApplication.performAdd(2, 2));
		System.out.println("2-2=" + mathApplication.performSubstract(2, 2));
		System.out.println("2*2=" + mathApplication.performMultiply(2, 2));
		System.out.println("2/2=" + mathApplication.performDivide(2, 2));

		context.close();
	}

}
