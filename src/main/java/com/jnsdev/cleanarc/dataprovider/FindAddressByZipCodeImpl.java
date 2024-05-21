package com.jnsdev.cleanarc.dataprovider;

import com.jnsdev.cleanarc.core.dataprovider.FindAddressByZipCode;
import com.jnsdev.cleanarc.core.domain.Address;
import com.jnsdev.cleanarc.dataprovider.client.FindAddressByZipCodeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 16:24
 */
@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return new Address(addressResponse);
    }
}
