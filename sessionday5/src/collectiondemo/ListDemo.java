package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        Bank b1=new Bank(123,"ICICI BANK");
        ArrayList<String> al=new ArrayList<String>();
        al.add(0,"chennai");
        al.add(1,"Altimetrik");
        String bb=al.get(0);
        String ii=al.get(1);
        for (String i:al) {
            System.out.println(i);
        }
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}








