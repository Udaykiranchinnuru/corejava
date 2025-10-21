package com.jspyders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass
{
    public static void main(String[] args) {
        System.out.println("main starts");


        Runnable task1 =()->{
            for(int i=1; i<=5; i++)
            {
                System.out.println("running task1");
            }
        };
        ExecutorService es1= Executors.newSingleThreadExecutor();
        es1.submit(task1);
        es1.shutdown();

        System.out.println("main ends");

    }
}
