package com.stepik.zad2;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Zad2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Zad2Application.class, args);

		SortManager sortManager = context.getBean(SortManager.class);

		int[] arr = new int[] { 4, 1, 5, 7, 1, 2, 1, 5, 4 };
		System.out.println("Tablica przed sortowaniem: ");
		System.out.println(Arrays.toString(arr));

		int[] res = sortManager.performSort(arr);
		System.out.println("Tablica po sortowaniu: ");
		System.out.println(Arrays.toString(res));
	}
}
