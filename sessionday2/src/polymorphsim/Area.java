package polymorphsim;

public class Area extends Main{

        public void findArea(float radius){
            System.out.println(Math.PI*radius* radius);
        }


    public static void main(String[] args) {
        Area area=new Area();
        area.findArea(12);
    }
}



