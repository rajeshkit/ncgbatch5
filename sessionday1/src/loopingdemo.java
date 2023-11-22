public class loopingdemo {
    public static void main(String[] args) {
         for(int i=0;i<5;i++) {
            System.out.println("line 4");
            if(i==3) {
               continue;
            }
            System.out.println("line 5");
            System.out.println("line 6");
        }
    }
}
