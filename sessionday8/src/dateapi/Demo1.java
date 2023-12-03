package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo1 {
    public static void main(String[] args) {
        LocalDate ld=LocalDate.now();
        System.out.println(ld);
        LocalDate ld1=LocalDate.of(1999,03,24);
        System.out.println(ld1);
        LocalTime lt=LocalTime.now();
        System.out.println(lt);
        LocalTime lt1=LocalTime.of(13,35,50);
        System.out.println(lt1);
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
       // convert localdate to string
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM dd yyyy");
        String convertedLocalDate=dtf.format(ld);
        System.out.println(convertedLocalDate);
        String dob="12/1967/25";//"MM/yyyy/dd";
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/yyyy/dd");
        System.out.println(LocalDate.parse(dob,dtf1));
    }
}















