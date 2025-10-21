package com.jspyders.staticnonstaticblocks;

public class Mainclass2
{
        public static void main(String[] args)
        {
            Exp e1=new Exp();
            System.out.println(e1.a);
        }
    }
    class Exp
    {
        int a = 5;

        {
            System.out.println(" this is first non static block");
        }

        public void m1()
        {
            System.out.println("m1() non  method ");
        }

         {
            System.out.println(" this is second non static block");
        }
    }





