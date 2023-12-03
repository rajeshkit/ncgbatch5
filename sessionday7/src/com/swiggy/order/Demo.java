package com.swiggy.order;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<Void>> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            tasks.add(() -> {
                System.out.println("Task " + i);
                return null;
            });
        }

        executorService.invokeAll(tasks);
    }
}
