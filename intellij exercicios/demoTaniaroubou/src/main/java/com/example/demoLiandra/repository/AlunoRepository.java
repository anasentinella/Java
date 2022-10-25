package com.example.demoLiandra.repository;

import com.example.demoLiandra.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
}
