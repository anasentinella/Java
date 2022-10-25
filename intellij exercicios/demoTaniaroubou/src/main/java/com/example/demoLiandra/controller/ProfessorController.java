package com.example.demoLiandra.controller;


import com.example.demoLiandra.model.Professor;
import com.example.demoLiandra.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController
    @RequestMapping("/apiProfessor")
    public class ProfessorController {

        @Autowired
        ProfessorRepository prRepo;

        @GetMapping("/todos")
        public List<Professor> buscarTodos()
        {
            return prRepo.findAll();
        }
    }


