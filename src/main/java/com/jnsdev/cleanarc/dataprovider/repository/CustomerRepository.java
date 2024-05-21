package com.jnsdev.cleanarc.dataprovider.repository;

import com.jnsdev.cleanarc.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 16:37
 */

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
