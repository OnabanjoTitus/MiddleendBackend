package com.middleend.middlend.services;

import com.middleend.middlend.Models.Customer;
import com.middleend.middlend.Models.Products;
import com.middleend.middlend.dtos.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerRegistrationServices {

    private final CustomerServices customerServices;

    @Autowired
    public CustomerRegistrationServices(@Qualifier("customer") CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    public void registerCustomer(Customer customer){
        customerServices.registerCustomer(customer);
    }

    public Customer getCustomerByDetails(String name) {
        return customerServices.getCustomerByDetails(name);
    }

    public void addProducts(Products products) {
        customerServices.addProduct(products);
    }

    public List<Products> getProductsBySeller(String name) {
       return customerServices.getProductsBySeller(name);
    }
    public void addToCart(String customer,int quantity,Products products){
        customerServices.addToCart(customer,quantity,products);
    }
    public void addToCart(String customer,Products products){
        customerServices.addToCart(customer,products);
    }
    public List<Products> getCart(String customer){
       return customerServices.getCart(customer);
    }

    public void deleteFromCart(String customer) {
        customerServices.deleteFromCart(customer);
    }
}
