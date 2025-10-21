package com.jspyders.exception;

public class Mainclass1
{
    public static void test() throws InterruptedException
    {
        Thread.sleep( 200);

    }

    public static void main(String[] args)
    {
        try
        {
            test();
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }


    }


}


