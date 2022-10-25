package com.example.demoLiandra.controller;

import com.example.demoLiandra.model.Aluno;
import com.example.demoLiandra.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping("/todos")
    public List<Aluno> buscarTodos() {
        return alRepo.findAll();
    }

    @GetMapping("/aluno/{ra}")
    public Optional<Aluno> buscarPorRa (@PathVariable(value = "ra")int ra){
        return alRepo.findById(ra);
    }

    @PostMapping("/inserir")
    public void inserirAluno(@RequestBody Aluno al ){
        alRepo.save(al);
    }
}
