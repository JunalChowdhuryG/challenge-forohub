package com.alura.challenge_forohub.repository;

import com.alura.challenge_forohub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
