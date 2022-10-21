package controller;

import Repository.ClienteRepository;
import Repository.ProdutoRepository;
import model.Cliente;
import model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ClienteControle {
    @Autowired
    ClienteRepository clRepo;

    @GetMapping("/todos")
    public List<Cliente> buscarTodos()
    {
        return clRepo.findAll();
    }
}
