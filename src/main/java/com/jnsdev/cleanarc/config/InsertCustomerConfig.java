package com.jnsdev.cleanarc.config;

import com.jnsdev.cleanarc.core.usecase.impl.InsertCustumeruseCaseImpl;
import com.jnsdev.cleanarc.dataprovider.FindAddressByZipCodeImpl;
import com.jnsdev.cleanarc.dataprovider.InsertCustumerImpl;
import com.jnsdev.cleanarc.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 11:09
 */
@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustumeruseCaseImpl insertCustumeruseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustumerImpl insertCustumer,
            SendCpfForValidationImpl sendCpfForValidation
    ) {
        return  new InsertCustumeruseCaseImpl(findAddressByZipCode, insertCustumer, sendCpfForValidation);
    }
}
