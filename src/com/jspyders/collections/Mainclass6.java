package com.jspyders.collections;

import java.util.PriorityQueue;

public class Mainclass6
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq1= new PriorityQueue<Integer>();

        pq1.add(10);
        pq1.add(20);
        pq1.add(10);
        pq1.add(40);
        pq1.add(30);
        pq1.add(50);

        while (pq1.isEmpty()==false)
        {
            System.out.println(pq1.poll());
        }

    }
}
