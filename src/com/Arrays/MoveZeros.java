package com.Arrays;

import java.util.*;
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
//        int[] arr ={0,0};
        moveZeroes(arr);
        for(int i:arr){
            System.out.print(i +" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            while(i<nums.length && nums[i]!=0)i++;
            int j=i+1;
            while(j<nums.length-1 && nums[j]==0)j++;
            if(j>=nums.length)break;
            int temp= nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++;
        }
    }
}
