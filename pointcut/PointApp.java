package com.whizlabs.spring.basics.aop.pointcut;

import com.whizlabs.spring.basics.aop.pointcut.data.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PointcutConFig.class);
        Person person = context.getBean(Person.class);
        person.printFullName();
        person.log("Spring AOP pointcut demo");
    }
}
