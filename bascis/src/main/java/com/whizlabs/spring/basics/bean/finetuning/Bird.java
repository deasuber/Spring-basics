package com.whizlabs.spring.basics.bean.finetuning;

import org.springframework.stereotype.Component;

@Component
public class Bird  implements Animal{
    @Override
    public String move() {
        return "Fly";
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
