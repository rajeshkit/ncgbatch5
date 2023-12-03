package demo;

import com.sun.security.jgss.GSSUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {
       //addCustomer1();
        Customer customer=new Customer();//20202020
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the customer details");
        System.out.println("Enter the customer ID:");
        customer.setCustomerId(s.nextInt());
        s.nextLine();
        System.out.println("Enter the customer Name");
        customer.setCustomerName(s.nextLine());
        System.out.println("Enter the customer DOB");
        String dob=s.next();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Date date=sdf.parse(dob);
        customer.setCustomerDob(date);
        System.out.println("Is customer is holding an Membership");
        customer.setCustomerMembership(s.nextBoolean());
        CustomerStore customerStore=new CustomerStore();
                                        //20202020
        customerStore.registerCustomer(customer);
        Customer customer1=new Customer
                (675,"xyz",new Date(),false);
        customerStore.registerCustomer(customer1);

    }

    private static void addCustomer1() throws ParseException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the customer details");
        System.out.println("Enter the customer ID:");
        int id=s.nextInt();
        s.nextLine();
        System.out.println("Enter the customer Name");
        String name=s.nextLine();
        System.out.println("Enter the customer DOB");
        String dob=s.next();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        Date date=sdf.parse(dob);
        System.out.println("Is customer is holding an Membership");
        boolean isMember=s.nextBoolean();
        CustomerStore customerStore=new CustomerStore();
        customerStore.registerCustomer(id,name,date,isMember);
    }
}








