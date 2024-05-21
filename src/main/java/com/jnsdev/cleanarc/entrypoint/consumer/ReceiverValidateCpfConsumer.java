package com.jnsdev.cleanarc.entrypoint.consumer;

import com.jnsdev.cleanarc.core.domain.Customer;
import com.jnsdev.cleanarc.core.usecase.UpdateCustomerUseCase;
import com.jnsdev.cleanarc.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Autor Jairo Nascimento
 * @Created 20/05/2024 - 16:43
 */
@Component
public class ReceiverValidateCpfConsumer {

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "jnsdev")
    public void receiver(CustomerMessage customerMessage) {
        var customer = new Customer(customerMessage);
        updateCustomerUseCase.update(customer, customerMessage.zipCode());
    }
}
