//package com.jspyders.exception;

import java.util.Scanner;

public class Mainclass2
{
    public static void test(int num1,int num2)throws IllegalArgumentException
    {
        if(num2==0)
        {
            IllegalArgumentException i1=new IllegalArgumentException("invalid input :num2");
            throw i1;
        }
        int res=num1/num2;
        System.out.println(res);

    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number1");
        int num1=scn.nextInt();
        System.out.println("enter the number2");
        int num2=scn.nextInt();
        try{
            test(num1,num2);

        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
