package com.jnsdev.cleanarc.core.domain;

import com.jnsdev.cleanarc.dataprovider.client.response.AddressResponse;
import com.jnsdev.cleanarc.dataprovider.repository.entity.AddressEntity;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 15:47
 */
public record Address(
        String street,
        String city,
        String state) {

    public Address(AddressResponse addressResponse) {
        this(addressResponse.street(), addressResponse.city(), addressResponse.state());
    }

    public Address(AddressEntity entity) {
        this(entity.getStreet(), entity.getCity(), entity.getState());
    }
}
