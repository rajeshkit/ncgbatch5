package dateapi;

import com.sun.security.jgss.GSSUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Scanner s=new Scanner(System.in);
        String dob = s.next();//yyyy-MMM-dd
        System.out.println(dob);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd");
        Date dd=sdf.parse(dob);
        System.out.println(dd);

//        System.out.println("Enter the dob");
//        Date d=new Date();
//       // System.out.println(d);//Sat Dec 02 10:28:22 IST 2023
//        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss z E-MMMM-yyyy");
//        String convertedDate = sdf.format(d);
//        System.out.println(convertedDate);
        //2023/12/23 -  yyyy/MM/dd


    }
}
