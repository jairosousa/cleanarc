package com.jnsdev.cleanarc.core.dataprovider;

import com.jnsdev.cleanarc.core.domain.Address;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 16:00
 */
public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
