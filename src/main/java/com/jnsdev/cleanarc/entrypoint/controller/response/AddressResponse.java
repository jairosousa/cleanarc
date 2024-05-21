package com.jnsdev.cleanarc.entrypoint.controller.response;

import com.jnsdev.cleanarc.core.domain.Address;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 09:28
 */
public record AddressResponse(
        String street,
        String city,
        String state

) {
    public AddressResponse(Address address) {
        this(address.street(), address.city(), address.state());
    }
}
