package exceptionhandling;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the hotel name");
        String hotelName=s.nextLine();
        if(hotelName.equals("saravanbhavan")){
            throw new NoNonVegAvailableException("It is veg hotel dont expect mutton");
        }else{
            System.out.println("taste the non veg food");
        }
    }
}









