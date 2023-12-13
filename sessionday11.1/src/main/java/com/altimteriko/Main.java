package com.altimteriko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean-configuration.xml");
        Customer c1=ac.getBean(Customer.class);
        c1.customerDetails();

    }
}






