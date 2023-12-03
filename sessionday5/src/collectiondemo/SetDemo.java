package collectiondemo;

import java.util.HashSet;
import java.util.Vector;

public class SetDemo {
    public static void main(String[] args) {
//        HashSet<Integer> hs=new HashSet();
//        hs.add(456);hs.add(98);hs.add(null);hs.add(766);hs.add(456);hs.add(34);
//        System.out.println(hs);
        Bank b1=new Bank(123,"icici");Bank b2=new Bank(355,"sbi");
        Bank b3=new Bank(555,"canara");
        Bank b4=new Bank(123,"icici");
        HashSet<Bank> al=new HashSet();
        al.add(b1);al.add(b2);al.add(b3);al.add(null);al.add(b4);
        System.out.println(al);
    }
}









