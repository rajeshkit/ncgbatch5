package stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Altimetrik");
        StringBuffer sbb=new StringBuffer("Altimetrik");
        System.out.println(sb.hashCode()==sbb.hashCode());

        System.out.println(sb.equals(sbb));
        System.out.println(sb.hashCode());
        System.out.println(sbb.hashCode());
    }
}
