package generic;

public class Calculation {
    public <T,U> U display(T a, U b){
        System.out.println(a.getClass().getTypeName());
        System.out.println(b.getClass().getTypeName());
       if(a instanceof  Integer){

       }
       if(a instanceof  Float){

       }
       if(a instanceof  String ){

       }
        return b;
    }

    public static void main(String[] args) {
        Calculation c=new Calculation();
        c.display(6876,true);
    }
}









