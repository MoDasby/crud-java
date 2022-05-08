package com.estudos.apiRest.repository;

import com.estudos.apiRest.models.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
