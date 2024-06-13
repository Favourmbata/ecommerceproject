package com.ecommerceApp.ecommerce;

import com.ecommerceApp.ecommerce.dtos.request.CustomerRegistrationRequest;
import com.ecommerceApp.ecommerce.dtos.response.CustomerRegistrationResponse;
import com.ecommerceApp.ecommerce.services.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    public void registerCustomer(){
        CustomerRegistrationRequest request = new CustomerRegistrationRequest();
        request.setEmail("example@gmail.com");
        request.setPassword("password");


        CustomerRegistrationResponse response = customerService.register(request);

        assertNotNull(response);
        assertNotNull(response.getId());
    }

//    @Test
//    @Sql({"/scripts/inserts.sql"})
//    void getCustomerTest(){
//
//    }
}
