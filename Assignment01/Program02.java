package com.sunbeam.javaassignment01;

import java.util.Scanner;

public class Program02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        if(sc.hasNextDouble() == false) {
            System.out.println("Invalid input");
            return;
        }
        double d1 = sc.nextDouble();

        System.out.println("Enter second number");
        if(sc.hasNextDouble() == false) {
            System.out.println("Invalid input");
            return;
        }
        double d2 = sc.nextDouble();

        double avg = (d1 + d2)/2;
        System.out.println("Average = "+avg);

    }
}
