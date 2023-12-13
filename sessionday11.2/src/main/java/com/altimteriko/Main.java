package com.altimteriko;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(ApplicationBeanConfig.class);
        Customer c1= ac.getBean(Customer.class);
        c1.customerDetails();
        Order o1 = ac.getBean(Order.class);
        o1.orderDetails();

    }
}









