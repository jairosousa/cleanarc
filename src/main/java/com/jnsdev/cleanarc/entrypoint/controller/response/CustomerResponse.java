package com.jnsdev.cleanarc.entrypoint.controller.response;

import com.jnsdev.cleanarc.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 09:25
 */
public record CustomerResponse(
        String name,
        String cpf,
        Boolean isValidCpf,
        AddressResponse address

) {
    public CustomerResponse(Customer customer) {
        this(customer.name(), customer.cpf(), customer.isValidCpf(), new AddressResponse(customer.address()));
    }
}
