package com.jspyders.collections;

import java.util.LinkedHashMap;//only key one null //value allow duplicates

public class Mainclass8
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String> lm1=new LinkedHashMap<Integer,String>();
        lm1.put(40,"A");
        lm1.put(20,"B");
        lm1.put(30,"null");
        lm1.put(10,"D");
        lm1.put(null,"E");
        lm1.put(60,"B");

        System.out.println(lm1);

    }
}
