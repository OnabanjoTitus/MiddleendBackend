package com.middleend.middlend.dtos;

import com.middleend.middlend.Models.Customer;
import com.middleend.middlend.Models.Products;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("customer")
public class CustomerDatabaseMock implements CustomerServices {
    Map<String,Customer>buyers= new HashMap<>();
    Map<String,Customer>sellers=new HashMap<>();
    Map<String, List<Products>> sellersAndProducts= new HashMap<>();
    List<Products>productsList= new ArrayList<>();
    Map<String, List<Products>>cartItems=new HashMap<>();
    List<Products>items= new ArrayList<>();
    @Override
    public void registerCustomer(Customer customer) {
        String type=filterCustomerType(customer.getCustomerType());
        if(type.equals("buyer")){
            buyers.put(customer.getId(),new Customer(customer.getFirstName(),customer.getSurname(),customer.getCustomerType()));
        }
        if(type.equals("seller")){
            sellers.put(customer.getId(),new Customer(customer.getFirstName(),customer.getSurname(),customer.getCustomerType()));
        }
    }

    @Override
    public Customer getCustomerByDetails(String name) {
        return sellers.get(name);
    }

    @Override
    public void addProduct(Products products) {
        Customer customer=sellers.get(products.getSellerId());
        if(customer!=null) {
            productsList.add( new Products(products.getProductName(), products.getProductId(),
                    products.getProductDescription(), products.getProductPrice()));
            sellersAndProducts.put(products.getSellerId(),productsList);
        }
    }

    @Override
    public List<Products> getProductsBySeller(String name) {
     return sellersAndProducts.get(name);

    }

    @Override
    public void addToCart(String customer,Products products) {
        Customer customer1=null;
        List<Products> products1 =  sellersAndProducts.get(products.getSellerId());
        if(products1!=null){
            customer1=sellers.get(customer);
            if(customer1==null){
                customer1=buyers.get(customer);
            }
            if (customer1.getCustomerType().equals("buyer")||customer1.getCustomerType().equals("seller")){

                items.add(new Products(products.getProductName(),products.getProductDescription(),products.getProductPrice()));
                cartItems.put(customer,items);
            }
        }
    }

    @Override
    public void addToCart(String customer, int quantity, Products products) {
        int num=1;
        while (num<=quantity){
            addToCart(customer,products);
            num++;
        }
    }

    @Override
    public List<Products> getCart(String customer) {
        return cartItems.get(customer);
    }

    @Override
    public void deleteFromCart(String customer) {
        cartItems.put(customer,null);
    }


    private String filterCustomerType(String customerType) {
        String type="";
        if (customerType.toLowerCase().equals("buyer")){
            type="buyer";
        }
        if (customerType.toLowerCase().equals("seller")){
            type="seller";
        }
        return type;
    }



}
