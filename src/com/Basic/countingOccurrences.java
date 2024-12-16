package com.Basic;

import java.util.Scanner;
public class countingOccurrences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a one digit number, that you want to find the times it appears in the above number: ");
        int f = sc.nextInt();

        int original = n;
        int count=0;
        while(n>0){
            int rem = n%10;
            if (rem==f)count++;
            n/=10;
        }
        System.out.println("The number of occurrences of "+f +" appears in the number "+original + " is "+count);

    }
}
