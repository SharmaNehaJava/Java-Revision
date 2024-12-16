package com.Basic;

import java.util.Scanner;
public class isLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char to check whether the entered value is character or not : ");
        char c = sc.next().trim().charAt(0);

        if(c>='a' && c<='z') System.out.println("LowerCase");
        else System.out.println("UpperCase");
    }
}
