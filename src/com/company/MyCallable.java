package com.company;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private String name;
    public MyCallable(String name) {
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        System.out.println(name + " đang thực thi...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }
}
