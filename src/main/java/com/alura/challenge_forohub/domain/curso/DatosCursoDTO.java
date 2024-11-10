package com.alura.challenge_forohub.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCursoDTO(
        @NotBlank
        String nombre,
        @NotBlank
        String categoria
) {
}
