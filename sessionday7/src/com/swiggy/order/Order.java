package com.swiggy.order;

public class Order {
    private int orderId;
    private String restaurantName;
    private String productName;
    private int quantity;
    private int cost;
    Order(){

    }

    public Order(int orderId, String restaurantName, String productName, int quantity, int cost) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.productName = productName;
        this.quantity = quantity;
        this.cost = cost;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", restaurantName='" + restaurantName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
