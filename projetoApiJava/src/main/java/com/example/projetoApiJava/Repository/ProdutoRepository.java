package com.example.projetoApiJava.Repository;

import com.example.projetoApiJava.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
