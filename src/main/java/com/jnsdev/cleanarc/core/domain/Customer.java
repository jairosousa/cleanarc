package com.jnsdev.cleanarc.core.domain;

import com.jnsdev.cleanarc.dataprovider.repository.entity.CustomerEntity;
import com.jnsdev.cleanarc.entrypoint.consumer.message.CustomerMessage;
import com.jnsdev.cleanarc.entrypoint.controller.request.CustomerRequest;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 15:47
 */
public record Customer(
        String id,
        String name,
        String cpf,
        Address address,
        Boolean isValidCpf
) {
    public Customer(CustomerEntity entity) {
        this(entity.getId(), entity.getName(), entity.getCpf(), new Address(entity.getAddress()), entity.getIsValidCpf());
    }

    public Customer(CustomerMessage message) {
        this(message.id(), message.name(), message.cpf(), null, message.isValidCpf());
    }

    public Customer(Customer customer, Address address) {
        this(customer.id(), customer.name(), customer.cpf(), address, customer.isValidCpf());
    }
    public Customer(CustomerRequest customer) {
        this(null, customer.name(), customer.cpf(), null, false);
    }
    public Customer(String id,CustomerRequest customer) {
        this(id, customer.name(), customer.cpf(), null, false);
    }
}
