package threaddemo;

public class Trainer implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName()+" : "+i);
            System.out.println("Training");
        }

    }
}
