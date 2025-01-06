package com.Arrays;

import java.util.*;
public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4, 5, 6, 7};
        int k= 3;
        rotate(arr, k);
        for(int i:arr){
            System.out.print(i);
        }
    }
    public static void rotate(int[] nums, int k) {
        if(k==0 || nums.length<=1)return;
        k=k%nums.length;

        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }
    public static void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s]= arr[e];
            arr[e]= temp;
            s++;
            e--;
        }
    }
//    public static void rotate(int[] nums, int k) {
//        k=k%nums.length;
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i=k+1;i<nums.length; i++){
//            list.add(nums[i]);
//        }
//        for(int i=0;i<k;i++){
//            list.add(nums[i]);
//        }
//        for(int i=0;i<nums.length;i++){
//            nums[i] = list.get(i);
//        }
//    }
}
