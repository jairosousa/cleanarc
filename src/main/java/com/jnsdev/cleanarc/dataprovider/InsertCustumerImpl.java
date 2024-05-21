package com.jnsdev.cleanarc.dataprovider;

import com.jnsdev.cleanarc.core.dataprovider.InsertCustumer;
import com.jnsdev.cleanarc.core.domain.Customer;
import com.jnsdev.cleanarc.dataprovider.repository.CustomerRepository;
import com.jnsdev.cleanarc.dataprovider.repository.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 16:40
 */
@Component
public class InsertCustumerImpl implements InsertCustumer {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void insert(Customer customer) {
        var customerEntity = new CustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
