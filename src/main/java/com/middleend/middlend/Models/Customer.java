package com.middleend.middlend.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Customer {
    private String id;
    private String firstName;
    private String surname;
    private List<Address> addresses;
    private String customerType;

    public Customer() {

    }

    public Customer(String firstName, String surname,String customerType) {
        this.firstName = firstName;
        this.surname = surname;
        this.customerType=customerType;
    }

    public Customer(@JsonProperty("userId")String id, @JsonProperty("firstName")String firstName,
                    @JsonProperty("lastName")String surname, @JsonProperty("customerType")String customerType) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.customerType = customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public String getCustomerType() {
        return customerType;
    }
}
