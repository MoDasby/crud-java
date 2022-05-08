package com.estudos.apiRest.controllers;

import com.estudos.apiRest.exception.PersonNotFoundException;
import com.estudos.apiRest.repository.PersonRepository;

import java.util.List;

import com.estudos.apiRest.models.Person;

import com.estudos.apiRest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@SuppressWarnings("unused")
public class PersonController {
    
    @Autowired
    PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person personCreated = personService.create(person);

        return ResponseEntity.ok(personCreated);
    }

    @GetMapping()
    public ResponseEntity<List<Person>> getPersons() {
        List<Person> person = personService.read();

        return ResponseEntity.ok(person);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable Long id) {
        Person person = personService.read(id);

        return ResponseEntity.ok(person);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id, @RequestBody Person person) {
        Person personUpdated = personService.update(id, person);

        return ResponseEntity.ok(personUpdated);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePerson(@PathVariable Long id) {
        personService.delete(id);

        return ResponseEntity.ok().build();
    }
}
