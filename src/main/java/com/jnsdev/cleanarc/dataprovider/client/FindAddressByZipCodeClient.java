package com.jnsdev.cleanarc.dataprovider.client;

import com.jnsdev.cleanarc.dataprovider.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 16:14
 */

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${jnsdev.client.address.url}es"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
