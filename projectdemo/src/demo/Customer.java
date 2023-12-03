package demo;

import java.util.Date;

public class Customer {
    private int customerId;
    private String customerName;
    private Date customerDob;
    private boolean isCustomerMembership;

    public Customer() {
    }

    public Customer(int customerId, String customerName, Date customerDob, boolean isCustomerMembership) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerDob = customerDob;
        this.isCustomerMembership = isCustomerMembership;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerDob() {
        return customerDob;
    }

    public void setCustomerDob(Date customerDob) {
        this.customerDob = customerDob;
    }

    public boolean isCustomerMembership() {
        return isCustomerMembership;
    }

    public void setCustomerMembership(boolean customerMembership) {
        isCustomerMembership = customerMembership;
    }
}










