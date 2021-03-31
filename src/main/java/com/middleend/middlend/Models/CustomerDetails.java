package com.middleend.middlend.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerDetails {
    private final int customerId;
    private final String customerType;

    public CustomerDetails(@JsonProperty("customerId") int customerId,@JsonProperty("customerType") String customerType) {
        this.customerId = customerId;
        this.customerType = customerType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerType() {
        return customerType;
    }
}
