package com.stepik.zad3.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.stepik.zad3.domain.Person;

@Service
public class PersonService {

    private final Person prezes;
    private final Person wiceprezes;
    private final Person sekretarka;

    public PersonService(
            @Qualifier("prezes") Person prezes,
            @Qualifier("wiceprezes") Person wiceprezes,
            @Qualifier("sekretarka") Person sekretarka) {
        this.prezes = prezes;
        this.wiceprezes = wiceprezes;
        this.sekretarka = sekretarka;
    }

    public Person getPrezes() {
        return prezes;
    }

    public Person getWiceprezes() {
        return wiceprezes;
    }

    public Person getSekretarka() {
        return sekretarka;
    }
}
