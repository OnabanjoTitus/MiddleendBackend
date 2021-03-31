package com.middleend.middlend.Models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
Address address;
    @BeforeEach
    void setUp() {
  address= new Address();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatGettersAndSettersAreWorking(){
        address.setCity("Lagos");
        address.setCountry("Nigeria");
        address.setHouseNumber(12);
        address.setPostalCode("12345");
        address.setState("Lagos");
        address.setStreet("oyadiran");
        assertEquals("Lagos",address.getCity());
        assertEquals("Nigeria",address.getCountry());
        assertEquals(12,address.getHouseNumber());
        assertEquals("12345",address.getPostalCode());
        assertEquals("Lagos",address.getState());
        assertEquals("oyadiran",address.getStreet());

    }
}