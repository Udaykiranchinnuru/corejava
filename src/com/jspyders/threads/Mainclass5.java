package com.jspyders.threads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Mainclass5
{
    public static void main(String[] args) {
        System.out.println("main starts");

        int cores=Runtime.getRuntime().availableProcessors();
        System.out.println("cores = "+ cores);

        ScheduledExecutorService es1= Executors.newScheduledThreadPool(cores);
        Runnable task1=()->{
            System.out.println("running task1");
        };
        es1.scheduleWithFixedDelay(task1,  0, 8, TimeUnit.SECONDS);
        es1.shutdown();
        System.out.println(" program ends ");


    }
}
