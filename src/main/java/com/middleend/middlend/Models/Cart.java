package com.middleend.middlend.Models;

import com.middleend.middlend.dtos.CustomerDatabaseMock;
import com.middleend.middlend.dtos.CustomerServices;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<String, Items> cartItems;
    private CustomerServices productService;
    private BigDecimal total=BigDecimal.ZERO;
    private Address deliveryAddress;

    public Cart() {
        productService= new CustomerDatabaseMock();
        cartItems= new HashMap<>();
    }
//    public void addToCart(Products product){
//        if(isVerifiedProduct(product)){
//            Items item= cartItems.get(product.getProductId());
//            if(item==null){
//                item= new Items(product);
//            }
//            item.(BigInteger.ONE.intValue());
//            cartItems.put(product.getProductId(),item);
//        }
//    }
//    public void addToCart(Products product,int quantity){
//        if(isVerifiedProduct(product)){
//            Items item= cartItems.get(product.getProductId());
//            if(item==null){
//                item= new Items(product);
//            }
//            item.addItems(quantity);
//            cartItems.put(product.getProductId(),item);
//        }
//
//    }
//    private boolean isVerifiedProduct(Products product){
//        boolean verified=false;
//        Products verifiedProduct= (Products) productService.getProductsBySeller(product.getProductId());
//        if(verifiedProduct!=null)
//        {verified=true;}
//        return verified;
//
//    }
    public Map<String, Items> getCartItems() {
        return cartItems;
    }

    public void setCartItems(Map<String, Items> cartItems) {
        this.cartItems = cartItems;
    }

    public CustomerServices getProductService() {
        return productService;
    }

    public void setProductService(CustomerServices productService) {
        this.productService = productService;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

}
