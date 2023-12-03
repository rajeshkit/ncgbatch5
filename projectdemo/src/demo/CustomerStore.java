package demo;

import java.util.Date;
import java.util.List;

public class CustomerStore {
    public void registerCustomer(int id, String name, Date dob,boolean isMember){
        // this method should register the customer details
        System.out.println(id+" "+name+" "+dob+" "+isMember);
    }                               //20202020
    public void registerCustomer(Customer c){
        Customer c1=c;
        System.out.println(c.getCustomerId());//100
        System.out.println(c.getCustomerName());//abc
        System.out.println(c.getCustomerDob());//12-12-1990
        System.out.println(c.isCustomerMembership());//true
        // c - inside the customer c has all the one customer details
        // store the customer logic
    }
    public void registerCustomer(List<Customer> c){

    }
}









