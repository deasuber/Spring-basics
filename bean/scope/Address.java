package com.whizlabs.spring.basics.bean.scope;

public class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}
