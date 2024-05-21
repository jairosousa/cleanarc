package com.jnsdev.cleanarc.core.usecase;

import com.jnsdev.cleanarc.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 09:39
 */
public interface UpdateCustomerUseCase {
    void update(Customer customer, String zipCode);
}
