package com.jspyders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass1
{
    public static void main(String[] args) {

        System.out.println("main starts");

        ExecutorService es1= Executors.newCachedThreadPool();
        Runnable task1=()->{
            System.out.println(" running task1");
        };
         for(int i=1; i<=5; i++)
         {
             es1.submit(task1);
         }
        es1.shutdown();

        System.out.println("main ends");
    }
}
