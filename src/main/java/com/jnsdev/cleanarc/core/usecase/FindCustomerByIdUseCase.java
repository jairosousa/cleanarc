package com.jnsdev.cleanarc.core.usecase;

import com.jnsdev.cleanarc.core.domain.Customer;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 17:21
 */
public interface FindCustomerByIdUseCase {

    Customer find(String id);
}
