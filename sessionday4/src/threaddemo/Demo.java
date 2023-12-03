package threaddemo;

public class Demo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Demo thread1=new Demo();
        thread1.setName("T1");
        thread1.start();  //invoke the run method
        Demo thread2=new Demo();
        thread2.setName("T2");
        thread2.start();
        Demo thread3=new Demo();
        thread3.setName("T3");
        thread3.start();
    }
}
