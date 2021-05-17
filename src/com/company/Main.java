package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        File f = new File("d:\\");
        String S = f.isDirectory() ? "Thu muc" : "Tap tin";
        System.out.println("../f11.txt la: " + S);
        String L[] = f.list();
        System.out.println("Noi dung thu muc: ");
        for (int i = 0; i < L.length; ++i){
            File f2 = new File(L[i]);
            System.out.println(L[i] + " " + (f2.isFile()? "Tap tin" : "Thu muc"));
        }
    }
}




