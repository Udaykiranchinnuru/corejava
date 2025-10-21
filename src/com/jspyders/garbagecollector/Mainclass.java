package com.jspyders.garbagecollector;


class Sample1 extends Object
{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() executed..");
    }
}

public class Mainclass {

    public static void main(String[] args) {
        System.out.println("Program Starts...");
        Sample1 s1 = new Sample1();
        System.out.println(s1.hashCode());
        s1 = null;
        System.gc();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Program Ends...");
    }
}
