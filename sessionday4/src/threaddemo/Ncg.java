package threaddemo;

public class Ncg implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            System.out.println("Listening 100% concentration");
        }
    }

    public static void main(String[] args) {
        Ncg n1=new Ncg();
        Thread t=new Thread(n1);
        t.start();
        Trainer tr=new Trainer();
        Thread t1=new Thread(tr);
        t1.start();

    }
}







