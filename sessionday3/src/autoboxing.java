public class autoboxing {
    public static void main(String[] args) {
        int[] arr={34,346,35,56,23,8};
        String[] names={"sdf","dfgf","yuytu","dgdfg"};
        char ch='t';
        int a=45;
        Integer i=Integer.valueOf(a); // primitive to non primitive
        Integer i1=Integer.valueOf("23erett");// string to integer
        System.out.println(i1);
        String str = Integer.toString(a);// int to string
        int k = Integer.parseInt("203ddd");//string to int
//        System.out.println(a==b);
//        Integer a1=a; //Autoboxing
//        int aa=a1;// Auto unboxing
//        Integer b1=Integer.valueOf(b);
//        System.out.println(a1==b1);
//        Integer ii1 = Integer.valueOf("23");
//        System.out.println(Integer.toString(a));
    }
}






