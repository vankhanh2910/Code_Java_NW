package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 1; i <= 10; i++) {
            MyRunnable myRunnable = new MyRunnable("Runnable " + i);
            executorService.execute(myRunnable);
        }
        executorService.shutdown();
    }
}




