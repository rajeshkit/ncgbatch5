package com.swiggy.order;

import com.sun.security.jgss.GSSUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Swiggy {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Order order1=new Order(100,"Saravanbhavan","Masala Dosai",4,400);
        Order order2=new Order();
        order2.setOrderId(200);
        order2.setProductName("Biryani");
        order2.setRestaurantName("Star Briyani");
        order2.setQuantity(35);
        order2.setCost(5000);
       // addNewOrder(order2);
       // searchOrderById();
         getAllOrders();
        //deleteOrderById();
        //updateOrder();
    }

    public static void updateOrder() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/swiggydb","root","root@123");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Order ID to be updated");
        int id=s.nextInt();
        s.nextLine();
        System.out.println("Enter restaurant new name to be updated");
        String restName=s.nextLine();
        System.out.println("Enter the new product name to be updated");
        String proName=s.nextLine();
        System.out.println("Enter the new quantity to be updated");
        int q=s.nextInt();
        System.out.println("Enter the new cost to be updated");
        int c=s.nextInt();
        String updateQuery="UPDATE swiggy SET name=?,productname=?,quantity=?,cost=? WHERE oid=?";
        PreparedStatement pstmt = conn.prepareStatement(updateQuery);
        pstmt.setString(1,restName);
        pstmt.setString(2,proName);
        pstmt.setInt(3,q);
        pstmt.setInt(4,c);
        pstmt.setInt(5,id);
        int result=pstmt.executeUpdate();
        if(result>0){
            System.out.println("Your details updated");
        }
        if(result==0){
            try {
                throw new OrderIdNotFoundException();
            } catch (OrderIdNotFoundException e) {
                System.out.println("Your details are not updated !! check the order ID");
            }

        }
        s.close();
        pstmt.close();
        conn.close();
    }


    public static void deleteOrderById() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/swiggydb","root","root@123");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Order ID to be deleted");
        int id=s.nextInt();
        PreparedStatement pstmt = conn.prepareStatement("DELETE FROM swiggy WHERE oid=?");
        pstmt.setInt(1,id);
        pstmt.executeUpdate();
        s.close();
        pstmt.close();
        conn.close();
    }


    public static void getAllOrders() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/swiggydb","root","root@123");
        Scanner s=new Scanner(System.in);
        PreparedStatement pstmt = conn.prepareStatement
                ("SELECT * FROM swiggy");
        ResultSet rs = pstmt.executeQuery();


        // System.out.println(rs);
        List<Order> orderList=new ArrayList<>();
        while(rs.next()) {
            Order order=new Order();
            order.setOrderId(rs.getInt(1));
            order.setRestaurantName(rs.getString(2));
            order.setProductName(rs.getString(3));
            order.setQuantity(rs.getInt(4));
            order.setCost(rs.getInt(5));
            orderList.add(order);
        }

        if(orderList.isEmpty()){
            System.out.println("No order found");
        }else{
            System.out.println("Some orders found");
            for (Order o:orderList) {
                System.out.println(o);
            }
        }
        conn.close();
    }

    public static void searchOrderById() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/swiggydb","root","root@123");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the order ID you want to see");
        int id=s.nextInt();
        PreparedStatement pstmt = conn.prepareStatement
                ("SELECT * FROM swiggy WHERE oid=?");
        pstmt.setInt(1,id);
        ResultSet rs = pstmt.executeQuery();
        // System.out.println(rs);
        Order order=new Order();
        if(rs.next()) {
            order.setOrderId(rs.getInt(1));
            order.setRestaurantName(rs.getString(2));
            order.setProductName(rs.getString(3));
            order.setQuantity(rs.getInt(4));
            order.setCost(rs.getInt(5));
        }else{
            System.out.println("Order is not exisiting !! check the order ID");
        }
        System.out.println(order);
        conn.close();
    }

    public static void addNewOrder(Order order2) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/swiggydb","root","root@123");
        System.out.println(conn);
        // String query="INSERT INTO swiggy VALUES(?,?,?,?,?)";
        // Statement stmt=conn.createStatement();
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO swiggy VALUES(?,?,?,?,?)");
        pstmt.setInt(1, order2.getOrderId());
        pstmt.setString(2, order2.getRestaurantName());
        pstmt.setString(3, order2.getProductName());
        pstmt.setInt(4, order2.getQuantity());
        pstmt.setInt(5, order2.getCost());
        pstmt.executeUpdate();
        conn.close();
    }
}
