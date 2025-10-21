package com.jspyders.staticnonstaticblocks;



public class Mainclass
{
    public static void main(String[] args)
    {
        System.out.println(Demo.a);

    }
}
class Demo {
    static int a = 5;

    static {
        System.out.println(" this is first static block");
    }

    public static void m1() {
        System.out.println("m1() static method ");
    }

    static {
        System.out.println(" this is second static block");
    }
}



