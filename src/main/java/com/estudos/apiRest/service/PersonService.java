package com.estudos.apiRest.service;

import com.estudos.apiRest.exception.PersonNotFoundException;
import com.estudos.apiRest.models.Person;
import com.estudos.apiRest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person create(Person person) {
        return personRepository.save(person);
    }

    public List<Person> read() {
        return personRepository.findAll();
    }

    public Person update(Long id, Person person) {
        if (personRepository.findById(id).isEmpty()) throw new PersonNotFoundException("Person not found");

        person.setId(id);
        return personRepository.save(person);
    }

    public void delete(Long id) {
        if (personRepository.findById(id).isEmpty()) throw new PersonNotFoundException("Person not found");

        personRepository.deleteById(id);
    }
}
