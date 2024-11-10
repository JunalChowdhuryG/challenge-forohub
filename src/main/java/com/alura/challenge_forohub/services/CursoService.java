package com.alura.challenge_forohub.services;

import com.alura.challenge_forohub.domain.curso.Curso;
import com.alura.challenge_forohub.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
  @Autowired
  private CursoRepository cursoRepository;

  public Curso save(Curso curso){
    return cursoRepository.save(curso);
  }
}
