package com.jnsdev.cleanarc.config;

import com.jnsdev.cleanarc.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.jnsdev.cleanarc.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.jnsdev.cleanarc.dataprovider.FindAddressByZipCodeImpl;
import com.jnsdev.cleanarc.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 11:18
 */
@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(
                findCustomerByIdUseCase,
                findAddressByZipCode,
                updateCustomer
        );
    }
}
