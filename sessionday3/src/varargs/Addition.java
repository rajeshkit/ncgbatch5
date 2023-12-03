package varargs;

public class Addition {
    public String add(int no1,float f1,String...a){
        String total=null;
       for (String no:a){
           total=total+no;
       }
        return total;
    }
    public String add1(int no1,float f1,int...a){
        String total=null;

        return total;
    }
    public static void main(String[] args) {
        Addition addition=new Addition();
        System.out.println(addition.add(12,5.4f,"df","sff","ffff"));
    }
}
