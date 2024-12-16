package com.Basic;

import java.util.Scanner;
public class isPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check whether the number is Prime or not: ");
        int n = sc.nextInt();

        System.out.println(checkPrime(n));
    }
    public static boolean checkPrime(int n){
        if(n<=1)return false;
        int c=2;
        while(c*c <= n){
            if(c%n == 0)return false;
            c++;
        }
        return true;
    }
}
