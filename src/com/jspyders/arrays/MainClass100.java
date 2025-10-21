package com.jspyders.arrays;

public class MainClass100//method overriding in interface
{
    public static void main(String[] args)
    {
        System.out.println("hello");

        Demo obj  = new Demo();
        obj.count(5);

    }
}
class Sample
{
    public void count(int num)
    {
        System.out.println("this is count() of Sample class");
        for (int i = 1; i <= num; i++)
        {
            System.out.println(i);
        }
    }}
    class Demo extends Sample
    {
        @Override
        public void count(int num) {
            System.out.println("this is count() of Demo class");
            for (int i = num; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }




