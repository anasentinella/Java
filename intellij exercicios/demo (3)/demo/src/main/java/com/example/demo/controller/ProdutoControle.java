package controller;


import com.example.demo.Model.Produto;
import com.example.demo.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



public class ProdutoControle {
    @Autowired
    ProdutoRepository PrRepo;

    @GetMapping("/todos")
    public List<Produto>buscarTodos() {return PrRepo.findAll();}
}