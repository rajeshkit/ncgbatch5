import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Hr{
    int takeHomeSalary();
}
public class Main {
       public static void main(String[] args) {
           Runnable r=()-> System.out.println("task1");
           Comparable<Integer> c= (o)-> o.hashCode();
           Comparator<Integer> cc=(o1,o2)->o1-o2;
           //java 8 java.util.function -> new predefeined functional interfaces
           Predicate<Integer> p=(e)->e>10;
           System.out.println(p.test(222));

           Predicate<String> p1=(e)->e.equals("altimetrik");
           System.out.println(p1.test("Chennai"));

           Consumer<Float> cc1=(e)-> System.out.println(e);
           cc1.accept(4.5f);

           Supplier<Long> s=()->8475558758L;
           Function<Integer,String> f=(e)->{
               int k=45;
               System.out.println(k);
               return Integer.toString(e);
           };
           System.out.println(f.apply(4567));
      //  Computer c=null;
         Hr hr =()->10000;
           System.out.println(hr.takeHomeSalary());
       Computer m=(a,b)-> System.out.println(a+b);
        m.add(3546,454);
        SecondInterface si=()->System.out.println("show method called");
        si.show();
    }
}
