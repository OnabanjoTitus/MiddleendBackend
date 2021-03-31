package com.middleend.middlend.Models;

import java.util.List;

public class Seller extends Customer{
    private List<Products> products;

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
