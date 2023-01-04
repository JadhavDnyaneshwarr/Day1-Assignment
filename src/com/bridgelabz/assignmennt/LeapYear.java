package com.bridgelabz.assignmennt;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int a = 4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year =>");
        int year = scanner.nextInt();
        int leap = year % a;
        if (leap == 0){
            System.out.println("The " + year + " year is leap year" );
        }else {
            System.out.println("The " + year + " year is leap year" );
        }

    }
}
