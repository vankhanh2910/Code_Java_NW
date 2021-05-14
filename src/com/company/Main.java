package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future<String>> listFuture = new ArrayList<Future<String>>();
        for (int i = 1; i <= 10; i++) {
            MyCallable myCallable = new MyCallable("Callable " + i);
            Future<String> future = executorService.submit(myCallable);
            listFuture.add(future);
        }
        for (Future future : listFuture) {
            try {
                System.out.println(future.get() + " kết thúc");
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}




