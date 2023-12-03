package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        char c='f'; // 0-9 a-z A-Z all special characters
        String s=new String("Altimetrik");
        String str=new String(" Chennai");
        System.out.println(s==str);

        System.out.println(s.equals(str));
        System.out.println(s.hashCode());
        System.out.println(str.hashCode());


    }
}
