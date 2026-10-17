package com.sunbeam.javaassignment01;

import java.util.Scanner;

public class Program03 {
    public static int menu(Scanner sc){
        System.out.println("----FOOD MENU----");
        System.out.println("1. Dosa      -    100/- ");
        System.out.println("2. Samosa    -    20/-");
        System.out.println("3. Idli      -    50/-");
        System.out.println("4. Pav Bhaji -    120/-");
        System.out.println("5. Noodles   -    70/-");
        System.out.println("6. Missal Pav-    100/-");
        System.out.println("7. Biscuits  -    30/-");
        System.out.println("8. Aloo Paratha-  50/-");
        System.out.println("9. Kachori   -    30/-");
        System.out.println("10. Generate Bill");

        System.out.println("Enter your choice = ");
        int choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double totalBill = 0;
        double qty;
        do{
            choice = menu(sc);
            switch(choice) {
                case 1:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 100;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 2:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 20;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 3:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 50;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 4:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 120;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 5:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 70;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 6:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 100;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 7:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 30;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 8:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 50;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 9:
                    System.out.println("Enter the quantity - ");
                    qty = sc.nextInt();
                    totalBill += qty * 30;
                    System.out.println("totalBill = " + totalBill);
                    break;

                case 10:
                    System.out.println("Final Bill = " + totalBill);
                    break;

                default:
                    System.out.println("Enter valid choice...");
                    break;

            }
        }while(choice != 10);

    }
}
