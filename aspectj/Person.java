package com.whizlabs.spring.basics.aop.aspectj;

import com.whizlabs.spring.basics.Printable;

public class Person implements Printable {
    private String fullName;

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public void printFullName() {
        System.out.println("Full name: " + fullName);
    }
}
