package com.sunbeam.javaassignment01;

import java.util.Scanner;

public class Program01 {
    int n;



    public static int  menu(Scanner sc){
        System.out.println("0. Exit");
        System.out.println("1. Convert into binary");
        System.out.println("2. Convert into octal");
        System.out.println("3. Convert into hexadecimal");
        System.out.println("4. Display all equivalents");


        System.out.println("Enter your choice - ");
        int choice = sc.nextInt();
        return choice;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no - ");
        int n = sc.nextInt();

        int choice;
        while((choice = menu(sc)) != 0){
            switch(choice){
                case 1:
                    System.out.println("Binary Equivalent - "+Integer.toBinaryString(n));
                    break;
                case 2:
                    System.out.println("Octal Equivalent - "+Integer.toOctalString(n));
                    break;
                case 3:
                    System.out.println("Hexadecimal Equivalent - "+Integer.toHexString(n));
                    break;
                case 4:
                    System.out.println("Binary Equivalent - "+Integer.toBinaryString(n));
                    System.out.println("Octal Equivalent - "+Integer.toOctalString(n));
                    System.out.println("Hexadecimal Equivalent - "+Integer.toHexString(n));
                    break;
                default:
                    System.out.println("Invalid Input...");
                    break;
            }
        }





    }
}

