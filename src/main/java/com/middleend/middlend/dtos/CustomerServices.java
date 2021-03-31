package com.middleend.middlend.dtos;

import com.middleend.middlend.Models.Customer;
import com.middleend.middlend.Models.Products;

import java.util.List;

public interface CustomerServices {
    void registerCustomer(Customer customer);
    Customer getCustomerByDetails(String name);
    void addProduct(Products products);
    List<Products> getProductsBySeller(String name);
    void addToCart(String customer,Products products);
    void addToCart(String customer,int quantity,Products products);
    List<Products> getCart(String customer);

    void deleteFromCart(String customer);
}
