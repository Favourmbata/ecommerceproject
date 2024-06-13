package com.ecommerceApp.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

//import java.util.List;
//import java.util.Set;
@Setter
@Getter
@Entity
public class Customer {
   @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String email;
    private String password;
//    private String address;
//    private String phoneNumber;
//    @OneToOne(fetch = EAGER, cascade = {CascadeType.MERGE})
//    private Cart cart;
//    @OneToMany(fetch = EAGER)
//    @Cascade({PERSIST, MERGE})
//    private List<Notification> notifications;
//    @ElementCollection(fetch = EAGER)
//    private Set<Role> roles;
}
