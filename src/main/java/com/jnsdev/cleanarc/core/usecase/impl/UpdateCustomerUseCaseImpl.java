package com.jnsdev.cleanarc.core.usecase.impl;

import com.jnsdev.cleanarc.core.dataprovider.FindAddressByZipCode;
import com.jnsdev.cleanarc.core.dataprovider.UpdateCustomer;
import com.jnsdev.cleanarc.core.domain.Customer;
import com.jnsdev.cleanarc.core.usecase.FindCustomerByIdUseCase;
import com.jnsdev.cleanarc.core.usecase.UpdateCustomerUseCase;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 09:41
 */
public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase, FindAddressByZipCode findAddressByZipCode, UpdateCustomer updateCustomer) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerByIdUseCase.find(customer.id());
        var address = findAddressByZipCode.find(zipCode);

        updateCustomer.update(new Customer(customer, address));
    }
}
