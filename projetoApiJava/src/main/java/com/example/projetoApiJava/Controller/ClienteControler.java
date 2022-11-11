package com.example.projetoApiJava.Controller;

import com.example.projetoApiJava.Model.Cliente;
import com.example.projetoApiJava.Repository.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiCliente")
public class ClienteControler {
    @Autowired
    CLienteRepository clRepo;

    @GetMapping("/todos")
    public List<Cliente> buscartodos() {
        return clRepo.findAll();
    }

    @PostMapping("/inserir")
    public void inserirCliente(@RequestBody Cliente cl) {
        clRepo.save(cl);
    }

    @DeleteMapping("/remover")
    public void deletarCliente(@RequestBody Cliente cl) {
        clRepo.delete(cl);
    }

    @PutMapping("/atualizar")
    public void atualizarCliente(@RequestBody Cliente cl) {
        clRepo.save(cl);
    }

   
}
