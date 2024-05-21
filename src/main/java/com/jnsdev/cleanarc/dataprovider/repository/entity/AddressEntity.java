package com.jnsdev.cleanarc.dataprovider.repository.entity;

import com.jnsdev.cleanarc.core.domain.Address;
import lombok.Data;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 16:34
 */

@Data
public class AddressEntity {
    private String street;
    private String city;
    private String state;

    public AddressEntity() {
    }

    public AddressEntity(Address address) {
        this.street = address.street();
        this.city = address.city();
        this.state = address.state();
    }
}
