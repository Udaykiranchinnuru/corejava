package com.jspyders.collections;

import java.util.LinkedList;

public class Mainclass22
{
    public static void main(String[] args) {
        System.out.println("ps");

        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("list size "+list.size());
        while (list.isEmpty()==false)
        {
            System.out.println(list.poll());
        }
        System.out.println("list size "+list.size());


        System.out.println("pe");
    }
}

