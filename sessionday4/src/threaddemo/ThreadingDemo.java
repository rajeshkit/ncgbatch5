package threaddemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadingDemo {
    public static void main(String[] args) {
        ExecutorService executor= Executors.newScheduledThreadPool(4) ;
        for (int i = 0; i < 100; i++) {
            int k= i;
            executor.execute(()-> {
                    System.out.println("task"+ k);

            });
        }

       
        executor.shutdown();
    }
}
