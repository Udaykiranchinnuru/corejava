package com.jspyders.collections;

import java.util.HashMap;
import java.util.Hashtable;

public class Mainclass7
{
    public static void main(String[] args)
    {
        Hashtable<Integer,String> ht1 =new Hashtable<Integer,String>();

        ht1.put(1,"A");
        ht1.put(2,"B");
        ht1.put(3,"C");
        ht1.put(4,"D");
        ht1.put(5,"E");
       System.out.println(" HashTable ->");
        System.out.println(ht1);


        HashMap<Integer,String> hm1 =new HashMap<>();

        hm1.put(1,"A");
        hm1.put(2,"null");
        hm1.put(3,"C");
        hm1.put(4,"D");
        hm1.put(5," E");
        hm1.put(4,"D");
        hm1.put(null,"X");
        System.out.println(" HashMap ->");
        System.out.println(hm1);

    }
}
