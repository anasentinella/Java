package com.example.demo.repository;

import com.example.demo.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;

public interface ProdutoRepository extends JpaRepository<Produto,Integer> {

}
