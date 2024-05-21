package com.jnsdev.cleanarc.dataprovider;

import com.jnsdev.cleanarc.core.dataprovider.DeleteCustomerById;
import com.jnsdev.cleanarc.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 10:59
 */
@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
