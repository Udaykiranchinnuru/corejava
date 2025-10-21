package com.jspyders.collections;


import java.util.Comparator;
import java.util.TreeSet;

class Descorder implements Comparator<String>
{
    @Override
    public int compare(String s1, String s2) {
        int h1=s2.compareTo(s1);
        return h1;
    }

}
public class Mainclass5
{
    public static void main(String[] args)
    {
        Descorder d1=new Descorder();
        TreeSet<String> ts1= new TreeSet<String>(d1);
        ts1.add("B");
        ts1.add("B");
        ts1.add("D");
        ts1.add("A");
        ts1.add("E");
        ts1.add("C");
        for(String value :ts1)
        {
            System.out.println(value);
        }

    }
}
