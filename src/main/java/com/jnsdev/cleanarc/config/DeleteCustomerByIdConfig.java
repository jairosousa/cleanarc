package com.jnsdev.cleanarc.config;

import com.jnsdev.cleanarc.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.jnsdev.cleanarc.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.jnsdev.cleanarc.dataprovider.DeleteCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 11:23
 */
@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            DeleteCustomerByIdImpl deleteCustomerById
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}
