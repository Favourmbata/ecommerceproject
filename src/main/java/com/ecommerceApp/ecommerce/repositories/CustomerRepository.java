package com.ecommerceApp.ecommerce.repositories;


import com.ecommerceApp.ecommerce.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
