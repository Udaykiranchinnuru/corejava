package com.jspyders.threads;//objects are synchronized or threadsafe

import java.util.ArrayList;

public class Mainclass8
{
    public static void main(String[] args) {
        System.out.println("main starts");

        ArrayList<Integer> list= new ArrayList<Integer>();
        System.out.println("size : "+list.size());
        Runnable task =()->
        {
            synchronized (list) {
                for (int i = 1; i <= 100; i++) {
                    list.add(i);
                }
            }
            System.out.println("size :"+list.size());
        };
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        t1.start();
        t2.start();
        System.out.println("main ends");
    }
}
