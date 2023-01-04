package com.bridgelabz.assignmennt;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        String a = "aditya";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word => ");
        String p = scanner.next();
        int x = a.length();
        int y = p.length();
        System.out.println(a.length());
        System.out.println(p.length());
        for (int i=0;i<a.length();i++){
            if ( x == y ) {
                char m = a.charAt(i);
                char n = p.charAt(i);
                if (m == n) {
                    System.out.println("strings are equal");
                } else {
                    System.out.println("strings are not equal");
                }
            }else{
                System.out.println("string is not equal");
            }
        }


    }
}
