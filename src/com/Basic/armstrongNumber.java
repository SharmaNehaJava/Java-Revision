package com.Basic;

import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a three digit number to check whether the given number is an Armstrong number or not: ");
        int n = sc.nextInt();

        int original =n;
        int sum =0;
        int count=0;
        while(n>0){
            int r = n%10;
            sum+=r*r*r;
            n/=10;
            count++;
        }
        if(count!=3){
            System.out.println("Invalid input, please enter only 3 digit number.");
            return;
        }
        System.out.println(original==sum);

    }
}
