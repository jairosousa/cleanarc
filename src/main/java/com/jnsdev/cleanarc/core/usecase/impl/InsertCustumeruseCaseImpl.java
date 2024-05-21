package com.jnsdev.cleanarc.core.usecase.impl;

import com.jnsdev.cleanarc.core.dataprovider.FindAddressByZipCode;
import com.jnsdev.cleanarc.core.dataprovider.InsertCustumer;
import com.jnsdev.cleanarc.core.dataprovider.SendCpfForValidation;
import com.jnsdev.cleanarc.core.domain.Customer;
import com.jnsdev.cleanarc.core.usecase.InsertCustomerUseCase;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 15:58
 */
public class InsertCustumeruseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustumer insertCustumer;

    private final SendCpfForValidation sendCpfForValidation;

    public InsertCustumeruseCaseImpl(
            FindAddressByZipCode findAddressByZipCode,
            InsertCustumer insertCustumer, SendCpfForValidation sendCpfForValidation
    ) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustumer = insertCustumer;
        this.sendCpfForValidation = sendCpfForValidation;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        insertCustumer.insert(new Customer(customer,address));
        sendCpfForValidation.send(customer.cpf());
    }
}
