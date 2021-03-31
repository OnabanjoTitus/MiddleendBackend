package com.middleend.middlend.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Products {
    private String sellerId;
    private String productId;
    private String productName;
    private String productDescription;
    private BigDecimal productPrice;
    private int ProductQuantity;

    public int getProductQuantity() {
        return ProductQuantity;
    }

    public Products(String productName, String productId, String productDescription, BigDecimal productPrice) {
        this.productName=productName;
        this.productId=productId;
        this.productDescription=productDescription;
        this.productPrice=productPrice;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Products(@JsonProperty("userId") String sellerId, @JsonProperty("productId")String productId, @JsonProperty("productName")String productName,
                    @JsonProperty("productDescription")String productDescription, @JsonProperty("productPrice")String productPrice,@JsonProperty("productQuantity") int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = BigDecimal.valueOf(Double.parseDouble(productPrice));
        this.sellerId=sellerId;
        this.ProductQuantity=productQuantity;

    }
//    public Products(@JsonProperty("productName")String productName,,
//                    @JsonProperty("productDescription")String productDescription) {
//        this.productName = productName;
//        this.productDescription = productDescription;
//
//
//    }
//    public Products(@JsonProperty("productName")String productName,
//                    @JsonProperty("productDescription")String productDescription) {
//        this.productName = productName;
//        this.productDescription = productDescription;
//
//    }

    public Products() {
        this.productId = null;
        this.productName = null;
        this.productDescription = null;
        this.productPrice = null;
    }

    public Products(String productName, String productDescription, BigDecimal productPrice) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }


}
