package com.jnsdev.cleanarc.dataprovider;

import com.jnsdev.cleanarc.core.dataprovider.FindCustomerById;
import com.jnsdev.cleanarc.core.domain.Customer;
import com.jnsdev.cleanarc.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 17:26
 */
@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> new Customer(entity));
    }
}
