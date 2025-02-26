package com.celcom.day13;
import java.util.concurrent.*;

public class Question3 {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newCachedThreadPool();
        
        
        for (int i = 1; i <= 10; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(2000); // Sleep for 2 seconds
                    System.out.println("Task executed by: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        
        
        executor.shutdown();
    }
}