package com.jspyders.collections;

import java.util.HashSet;

public class Mainclass1 {
    public static void main(String[] args) {
        System.out.println("ps");

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(null);
        set.add(33);
        set.add(30);
        set.add(40);


        for (Integer value : set) {
           if (value != null && value % 2 == 0) //print even and not null
           {
                System.out.println(value);
            }
            System.out.println("pe");
        }
    }
}
