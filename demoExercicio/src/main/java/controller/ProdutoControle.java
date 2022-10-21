package controller;

import Repository.ClienteRepository;
import Repository.ProdutoRepository;
import model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ProdutoControle {
    @Autowired
    ProdutoRepository PrRepo;
    @GetMapping("/todos")
    public List<Produto>buscarTodos() {return PrRepo.findAll();}
}
