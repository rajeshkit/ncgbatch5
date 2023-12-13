package com.altimteriko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    @Autowired
    private Product product;
    @Autowired
    private Order order;

    public Customer(Product product) {
        this.product = product;
    }

    public Customer(Order order) {
        this.order = order;
    }

    public void customerDetails(){
        System.out.println("customer details are");
        product.productDetails();
        order.orderDetails();
    }
}







