package com.Basic;

import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number whose fibonacci value you want to know : ");
        int n = sc.nextInt();

        if(n<=1){
            System.out.println("The value at the fibonacci series at the index "+ n +" is " + n);
            return;
        }
        int f=0;
        int s=1;
        int count=2;

        while(count<=n){
            int temp = s;
            s= s+f;
            f=temp;
            count++;
        }
        System.out.println("The value at the fibonacci series at the index "+ n +" is " + s);
    }

}
