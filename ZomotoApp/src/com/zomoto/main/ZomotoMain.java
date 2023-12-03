package com.zomoto.main;

import com.zomoto.exception.NoOrderExistsException;
import com.zomoto.model.Order;
import com.zomoto.service.OrderService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ZomotoMain {
    public static void main(String[] args) throws NoOrderExistsException {
       //addOrder();
        OrderService orderService=new OrderService();
        List<Order> list=orderService.getAllOrders();
        list.stream().forEach(e-> System.out.println(e.toString()));
    }

    public static void addOrder() {
        Scanner s=new Scanner(System.in);
        Order order=new Order();
        System.out.println("Enter the order details");
        System.out.println("Enter the order ID");
        order.setOrderId(s.nextInt());
        s.nextLine();
        System.out.println("Enter the restaurent name");
        order.setRestaurantName(s.nextLine());
        System.out.println("Enter the product name");
        order.setProductName(s.nextLine());
        // System.out.println("Enter the order date");
        order.setOrderDate(new Date());
        System.out.println("Enter the product quantity");
        order.setOrderQuantity(s.nextInt());
        System.out.println("Enter the product Cost");
        order.setOrderCost(s.nextInt());
        OrderService orderService=new OrderService();
        int result=orderService.saveNewOrder(order);
        if(result!=0){
            System.out.println("The Restaurant has taken your order");
        }else{
            System.out.println("The Restaurant has rejected your order");

        }
    }
}




























