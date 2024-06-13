package com.ecommerceApp.ecommerce.services;

import com.ecommerceApp.ecommerce.dtos.request.CustomerRegistrationRequest;
import com.ecommerceApp.ecommerce.dtos.response.CustomerRegistrationResponse;

public interface CustomerService {

    CustomerRegistrationResponse register(CustomerRegistrationRequest request);
}
