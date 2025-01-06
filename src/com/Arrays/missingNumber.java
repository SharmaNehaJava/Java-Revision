package com.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int n = 5;

//        approach 1: sum of n natural number is n*(n+1)/2 and take the total sum in the array and check whether it is equal or not, if not then subtract to find the missing number
//        int sum = 0;
//        for(int num : arr){
//            sum+=num;
//        }
//        int actualSum = (n*(n+1))/2;
//
//        if(actualSum==sum ) System.out.println("No number is missing");
//        else System.out.println(actualSum-sum +" is the number that was missing in the given array.");


//        approach 2: using xor operator, xor operator gives 0 if it is xor with the same number, else gives the same number
        int num = 0;
        for(int i=1;i<=n;i++){
            num^=i;
        }
        for(int i=0;i<arr.length;i++){
            num^=arr[i];
        }
        if(num<=0) System.out.println("No number is missing");
        else System.out.println(num +" is the number that was missing in the given array.");
    }
}
