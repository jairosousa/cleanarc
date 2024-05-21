package com.jnsdev.cleanarc.entrypoint.controller.request;

import jakarta.validation.constraints.NotBlank;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 17:01
 */
public record CustomerRequest(
        @NotBlank String name,
        @NotBlank String cpf,
        @NotBlank String zipCode) {
}
