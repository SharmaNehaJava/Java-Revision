package com.Basic;

import java.util.*;
public class reverseNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number that you want to reverse: ");
        int n = sc.nextInt();
        int temp =n;
        int ans=0;
        while(temp>0){
            int r = temp%10;
            ans*=10;
            ans+=r;
            temp/=10;
        }
        System.out.println(ans);
    }
}
