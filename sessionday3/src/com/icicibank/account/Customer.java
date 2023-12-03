package com.icicibank.account;

public class Customer  {
    void displayAccountInfo(){
        Account account=new Account();
        System.out.println(account.accountNumber);
        account.genareteAccountStatement();
    }
}






