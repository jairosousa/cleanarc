package com.jnsdev.cleanarc.core.usecase;

import com.jnsdev.cleanarc.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 15:57
 */
public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
