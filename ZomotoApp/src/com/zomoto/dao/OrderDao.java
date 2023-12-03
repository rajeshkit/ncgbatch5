package com.zomoto.dao;

import com.zomoto.model.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    public int saveNewOrder(Order order)  {
        String url="jdbc:mysql://localhost:3306/zomotoappdb";
        String user="root";
        String password="root@123";
        int status=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt=conn.prepareStatement("INSERT INTO zomotoorder VALUES(?,?,?,?,?,?)");
            pstmt.setInt(1,order.getOrderId());
            pstmt.setString(2,order.getRestaurantName());
            pstmt.setString(3,order.getProductName());
            pstmt.setDate(4,new Date(order.getOrderDate().getTime()));
            pstmt.setInt(5, order.getOrderQuantity());
            pstmt.setInt(6,order.getOrderCost());
            status=pstmt.executeUpdate();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
       return status;
    }
    public List<Order> getAllOrders(){
        String url="jdbc:mysql://localhost:3306/zomotoappdb";
        String user="root";
        String password="root@123";
        List<Order> orderList=new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(url,user,password);
            PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM zomotoorder");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                Order order = new Order();
                order.setOrderId(rs.getInt(1));
                order.setRestaurantName(rs.getString(2));
                order.setProductName(rs.getString(3));
                order.setOrderDate(rs.getDate(4));
                order.setOrderQuantity(rs.getInt(5));
                order.setOrderCost(rs.getInt(6));
                orderList.add(order);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return orderList;
    }
}























