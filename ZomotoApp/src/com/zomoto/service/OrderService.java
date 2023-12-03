package com.zomoto.service;

import com.zomoto.dao.OrderDao;
import com.zomoto.exception.NoOrderExistsException;
import com.zomoto.model.Order;

import java.util.List;

public class OrderService {
    public int saveNewOrder(Order order){
        OrderDao orderDao=new OrderDao();
        int result = orderDao.saveNewOrder(order);
        return result;
    }
    public List<Order> getAllOrders() throws NoOrderExistsException {
        OrderDao orderDao=new OrderDao();
        List<Order> list = orderDao.getAllOrders();
        if(list.isEmpty()){
            throw new NoOrderExistsException("no order found in the db");
        }
        return list;
    }
}














