package com.estudos.apiRest.repository;

import com.estudos.apiRest.models.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
