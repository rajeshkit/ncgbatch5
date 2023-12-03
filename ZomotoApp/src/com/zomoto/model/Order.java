package com.zomoto.model;

import java.util.Date;

public class Order {
    private int orderId;
    private String restaurantName;
    private String productName;
    private int orderQuantity;
    private int orderCost;
    private Date orderDate;
    public Order(){

    }

    public Order(int orderId, String restaurantName, String productName, int orderQuantity, int orderCost, Date orderDate) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.productName = productName;
        this.orderQuantity = orderQuantity;
        this.orderCost = orderCost;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public int getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(int orderCost) {
        this.orderCost = orderCost;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", restaurantName='" + restaurantName + '\'' +
                ", productName='" + productName + '\'' +
                ", orderQuantity=" + orderQuantity +
                ", orderCost=" + orderCost +
                ", orderDate=" + orderDate +
                '}';
    }
}










