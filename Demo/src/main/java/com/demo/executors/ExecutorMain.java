package com.demo.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.submit(() -> {
            try {
                System.out.println("1st task...started");
                TimeUnit.MILLISECONDS.sleep(5000);
                System.out.println("1st task...ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.submit(() -> {
            try {
                System.out.println("2nd task...started");
                TimeUnit.MILLISECONDS.sleep(10000);
                System.out.println("2nd task...ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

      executorService.shutdown();
    }
}