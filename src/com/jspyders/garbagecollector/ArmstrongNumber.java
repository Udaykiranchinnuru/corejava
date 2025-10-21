package com.jspyders.garbagecollector;
import java.util.Scanner;
    public class ArmstrongNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            int original = num;
            int sum = 0;
            int digits = 0;

            // Count number of digits
            int temp = num;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            // Calculate sum of each digit raised to power of digits
            temp = num;
            while (temp > 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, digits);
                temp /= 10;
            }

            if (sum == original)
                System.out.println(original + " is an Armstrong number.");
            else
                System.out.println(original + " is NOT an Armstrong number.");
        }
    }


