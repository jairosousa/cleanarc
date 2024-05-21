package com.jnsdev.cleanarc.core.usecase.impl;

import com.jnsdev.cleanarc.core.dataprovider.FindCustomerById;
import com.jnsdev.cleanarc.core.domain.Customer;
import com.jnsdev.cleanarc.core.usecase.FindCustomerByIdUseCase;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 17:21
 */
public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
