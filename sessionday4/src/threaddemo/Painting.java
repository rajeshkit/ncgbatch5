package threaddemo;

public class Painting implements Runnable{

    @Override
    public void run() {  // t1,t2- run
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }

    public static void main(String[] args) {
        Runnable p =new Painting();
        Thread t1=new Thread(p);
        t1.start();
        Thread t2=new Thread(p);
        t2.start();
    }
}







