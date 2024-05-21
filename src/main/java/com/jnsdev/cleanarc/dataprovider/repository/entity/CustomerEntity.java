package com.jnsdev.cleanarc.dataprovider.repository.entity;


import com.jnsdev.cleanarc.core.domain.Customer;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 16:34
 */

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private String cpf;
    private AddressEntity address;
    private Boolean isValidCpf;

    public CustomerEntity() {
    }

    public CustomerEntity(Customer customer) {
        this.id = customer.id();
        this.name = customer.name();
        this.cpf = customer.cpf();
        this.address = new AddressEntity(customer.address());
        this.isValidCpf = customer.isValidCpf();
    }
}
