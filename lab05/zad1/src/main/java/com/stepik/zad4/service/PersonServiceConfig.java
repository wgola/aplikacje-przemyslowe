package com.stepik.zad4.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stepik.zad4.domain.Person;

@Configuration
public class PersonServiceConfig {

    @Bean
    Person prezes() {
        return new Person(
                "Chrystal",
                "Havoc",
                "chavocr@yahoo.com",
                "Mymm");
    }

    @Bean
    Person wiceprezes() {
        return new Person(
                "Halley",
                "Gadaud",
                "hgadaud9@sohu.com",
                "Oyope");

    }

    @Bean
    Person sekretarka() {
        return new Person(
                "Kirbie",
                "Wrettum",
                "kwrettumj@slideshare.net",
                "Browsetype");
    }
}
