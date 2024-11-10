package com.alura.challenge_forohub.domain.topico;

import com.alura.challenge_forohub.domain.curso.Curso;

public record DatosRespuestaTopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        String fecha_creacion,
        String status,
        Curso curso
) {
  public DatosRespuestaTopicoDTO(Topico topico) {
    this(topico.getId(),topico.getTitulo(),topico.getMensaje() ,topico.getFecha_creacion().toString() , topico.getStatus().toString() ,topico.getCurso());
  }
}
