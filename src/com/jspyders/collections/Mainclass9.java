package com.jspyders.collections;

import java.util.TreeMap;//NOT PRESERVED INSERTION ORDER ,DUPLICATE VALUE ALLOWED,(VALUE)null  ALLOWED,(key)null not allowed

public class Mainclass9
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> tm1= new TreeMap<Integer,String>();
        tm1.put(10,"A");
        tm1.put(20,"B");
        tm1.put(30,"C");
        tm1.put(40,"D");
        tm1.put(50,"E");
        tm1.put(60,"F");

        System.out.println(tm1);
    }
}
