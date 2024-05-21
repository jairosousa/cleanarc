package com.jnsdev.cleanarc.entrypoint.controller;

import com.jnsdev.cleanarc.core.domain.Customer;
import com.jnsdev.cleanarc.core.usecase.DeleteCustomerByIdUseCase;
import com.jnsdev.cleanarc.core.usecase.FindCustomerByIdUseCase;
import com.jnsdev.cleanarc.core.usecase.InsertCustomerUseCase;
import com.jnsdev.cleanarc.core.usecase.UpdateCustomerUseCase;
import com.jnsdev.cleanarc.entrypoint.controller.request.CustomerRequest;
import com.jnsdev.cleanarc.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Autor Jairo Nascimento
 * @Created 19/05/2024 - 17:00
 */

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUseCase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;


    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = new Customer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.zipCode());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable("id") final String id) {
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = new CustomerResponse(customer);

        return ResponseEntity.ok(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") final String id,
                                       @Valid @RequestBody CustomerRequest customerRequest
    ) {
        var customer = new Customer(id, customerRequest);
        updateCustomerUseCase.update(customer, customerRequest.zipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") final String id) {
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }
}
