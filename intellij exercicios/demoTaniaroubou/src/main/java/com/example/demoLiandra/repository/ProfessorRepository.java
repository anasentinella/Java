package com.example.demoLiandra.repository;

import com.example.demoLiandra.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
