package com.jspyders.collections;

import java.util.TreeSet;

public class Mainclass4
{
    public static void main(String[] args)
    {
        TreeSet<String> ts1= new TreeSet<String>();
        ts1.add("B");
        ts1.add("B");
        ts1.add("D");
        ts1.add("A");
        ts1.add("E");
        ts1.add("null");
        for(String value :ts1)
        {
            System.out.println(value);
        }

    }
}
