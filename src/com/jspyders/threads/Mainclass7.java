package com.jspyders.threads;

class   Counter
{
    private int value =0;
    synchronized public void increment()
    {
        value++;
    }
    synchronized public void decrement()
    {
        value--;
    }
    synchronized public void showvalue()
    {
        System.out.println(value);

    }
}

public class Mainclass7
{
    public static void main(String[] args) {
        System.out.println("main starts");

        Counter counter= new Counter();
        counter.showvalue();

        Runnable task1=()->
        {
            System.out.println("thread1 starts");
            counter.increment();
            counter.showvalue();
            System.out.println("thread1 ends");

        };
        Runnable task2=()->
        {
            System.out.println("thread2 starts");
            counter.decrement();
            counter.showvalue();
            System.out.println("thread2 ends");

        };

        Thread t1=new Thread(task1);
        t1.start();
        Thread t2=new Thread(task2);
        t2.start();

        System.out.println("main ends");
    }
}
