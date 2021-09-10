package com.estudos.apiRest.controllers;

import com.estudos.apiRest.repository.PessoaRepository;

import java.util.List;

import com.estudos.apiRest.models.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoas")
public class PessoasController {
    
    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping()
    public List<Pessoa> list() {
        return pessoaRepository.findAll();
    }

    @PostMapping()
    public String add(@RequestParam("nome") String nome, @RequestParam(value = "sobrenome", required = false) String sobrenome) throws Exception{
        try{
            pessoaRepository.save(new Pessoa(nome, sobrenome));

            return "Cadastrado com sucesso!";
        } catch(Exception exception){
            return "Erro ao cadastrar nome: "+exception;
        }
    }
}
