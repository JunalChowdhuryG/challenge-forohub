package com.alura.challenge_forohub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosUsuarioAutenticadoDTO(
        @NotBlank
        String nombre,
        @NotBlank
        String contrasena
) {
}
