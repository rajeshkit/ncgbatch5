package com.icicibank.card;


import com.icicibank.account.Account;

import static java.util.Arrays.*;

import java.util.Arrays;
import java.util.Scanner;


public class CreditCard {
    void display(){

        Scanner s=new Scanner(System.in);
        Account account=new Account();
        System.out.println(account.accountNumber);
        account.genareteAccountStatement();
    }
}






