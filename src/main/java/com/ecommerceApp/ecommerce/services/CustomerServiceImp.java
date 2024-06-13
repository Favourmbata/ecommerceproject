package com.ecommerceApp.ecommerce.services;

import com.ecommerceApp.ecommerce.dtos.request.CustomerRegistrationRequest;
import com.ecommerceApp.ecommerce.dtos.response.CustomerRegistrationResponse;
import com.ecommerceApp.ecommerce.model.Customer;
import com.ecommerceApp.ecommerce.repositories.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerServiceImp implements CustomerService{
    private final CustomerRepository customerRepository;
    @Override
    public CustomerRegistrationResponse register(CustomerRegistrationRequest request) {

        Customer customer = new Customer();
        customer.setPassword(request.getPassword());
        customer.setEmail(request.getEmail());

        Customer savedCustomer = customerRepository.save(customer);
        CustomerRegistrationResponse response = new CustomerRegistrationResponse();
        response.setId(savedCustomer.getId());
        return response;
    }
}
