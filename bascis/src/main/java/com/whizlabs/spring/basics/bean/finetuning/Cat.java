package com.whizlabs.spring.basics.bean.finetuning;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{
    @Override
    public String move() {
        return "Jump";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
