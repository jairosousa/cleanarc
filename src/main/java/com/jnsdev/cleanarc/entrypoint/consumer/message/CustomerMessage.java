package com.jnsdev.cleanarc.entrypoint.consumer.message;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 14:48
 */
public record CustomerMessage(
        String id,
        String name,
        String zipCode,
        String cpf,
        Boolean isValidCpf) {
}
