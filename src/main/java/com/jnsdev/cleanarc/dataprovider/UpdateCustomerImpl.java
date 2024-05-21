package com.jnsdev.cleanarc.dataprovider;

import com.jnsdev.cleanarc.core.dataprovider.UpdateCustomer;
import com.jnsdev.cleanarc.core.domain.Customer;
import com.jnsdev.cleanarc.dataprovider.repository.CustomerRepository;
import com.jnsdev.cleanarc.dataprovider.repository.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 09:54
 */
@Component
public class UpdateCustomerImpl implements UpdateCustomer {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void update(Customer customer) {
        var customerEntity = new CustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
