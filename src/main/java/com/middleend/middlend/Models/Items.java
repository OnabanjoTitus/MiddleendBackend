package com.middleend.middlend.Models;

import java.math.BigDecimal;

public class Items {
    private Products product;
    private int quantity;
    private BigDecimal total;

    public Items(Products product) {
        this.product = product;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void addItems(int quantity) {
        this.quantity += quantity;
        this.total = this.product.getProductPrice().multiply(BigDecimal.valueOf(this.quantity));
    }

    public void reduceItems(int quantity) {
        if (this.quantity > quantity) {
            this.quantity = quantity;
            this.total = this.product.getProductPrice().multiply(BigDecimal.valueOf(this.quantity));
        }
    }
}
