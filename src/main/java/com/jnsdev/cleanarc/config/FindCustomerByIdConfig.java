package com.jnsdev.cleanarc.config;

import com.jnsdev.cleanarc.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.jnsdev.cleanarc.dataprovider.FindCustomerByIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 11:14
 */
@Configuration
public class FindCustomerByIdConfig {
    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById
    ) {
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
