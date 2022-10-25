package com.example.demo.controller;

import com.example.demo.Model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name="/apicliente")
public class ClienteController {
    @Autowired
    ClienteRepository clRepo;

        @GetMapping("/todos")
        public List<Cliente> buscarTodos()
        {
            return clRepo.findAll();
        }
    }

