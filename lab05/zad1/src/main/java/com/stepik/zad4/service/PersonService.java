package com.stepik.zad4.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import com.stepik.zad4.domain.Person;

@Service
public class PersonService {

    private List<Person> personList;

    public PersonService(ConfigurableApplicationContext applicationContext) {
        personList = new ArrayList<>(applicationContext
                .getBeansOfType(Person.class)
                .values()
                .stream()
                .toList());
    }

    public List<Person> getAllPeople() {
        return personList;
    }

    public Person getPersonById(int index) {
        return personList.get(index);
    }

    public Person removePerson(int index) {
        return personList.remove(index);
    }

    public Person editPerson(int index, Person newPerson) {
        personList.set(index, newPerson);
        return personList.get(index);
    }

    public Person addPerson(Person newPerson) {
        personList.add(newPerson);
        return personList.get(personList.size() - 1);
    }
}
