import java.util.Scanner;

public class Loan extends Bank{
    void getLoanData(){

        Bank b=new Bank();//HAS-A relationship
        System.out.println(Bank.bankId);
        Scanner s=new Scanner(System.in);//HAS-A relationship
        String str=new String();
        b.displayBankDetails();
    }
}
