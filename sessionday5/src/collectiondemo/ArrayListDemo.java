package collectiondemo;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {
        Bank b1=new Bank(123,"icici");Bank b2=new Bank(355,"sbi");
        Bank b3=new Bank(555,"canara");
        Vector<Bank> al=new Vector<>();
        al.add(b1);al.add(b2);al.add(b3);

        for (Bank bank : al) {
            System.out.println(al);
        }
        Vector<Long> alist=new Vector<>();
        alist.add(35676L); alist.add(4567876L);alist.add(3455676L);



        for (Long l : alist) {
            System.out.println(l);
        }

    }
}





