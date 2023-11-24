package com.stepik.zad4.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stepik.zad4.domain.Person;
import com.stepik.zad4.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping("/{index}")
    public Person getPersonById(@PathVariable int index) {
        return personService.getPersonById(index);
    }

    @PostMapping
    public Person addPerson(@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @PutMapping("/{index}")
    public Person editPerson(@PathVariable int index, @RequestBody Person person) {
        return personService.editPerson(index, person);
    }

    @DeleteMapping("/{index}")
    public Person deletePerson(@PathVariable int index) {
        return personService.removePerson(index);
    }
}
