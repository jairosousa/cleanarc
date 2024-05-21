package com.jnsdev.cleanarc.core.dataprovider;

import com.jnsdev.cleanarc.core.domain.Customer;

import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 17:22
 */
public interface FindCustomerById {

    Optional<Customer> find(final String id);
}
