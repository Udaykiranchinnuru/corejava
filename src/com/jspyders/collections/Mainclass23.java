package com.jspyders.collections;
import java.util.LinkedHashSet;

public class Mainclass23 {
        public static void main(String[] args) {
            System.out.println("ps");

            LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
            set.add(10);
            set.add(20);
            set.add(null);
            set.add(30);
            set.add(40);
            set.add(50);

            for (Integer value : set)
            {
                    System.out.println(value);
            }
        }
    }
