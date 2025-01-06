package com.Arrays;

import java.util.*;
public class Sorted_Rotated {
    public static void main(String[] args) {
        int[] arr = {5,5,6,6,6,9,1,2};
        boolean ans = check(arr);
        System.out.println(ans);
    }
    public static boolean check(int[] arr) {
        Stack<Integer> s = new Stack<>();

        int i=1;
        while(i<arr.length){
            if(arr[i]>=arr[i-1])i++;
            else break;
        }
        if(arr.length==i)return true;
        while(i<arr.length){
            s.push(arr[i]);
            i++;
        }
        i=1;
        s.push(arr[0]);
        while(arr[i]>arr[i-1] && i<arr.length){
            s.push(arr[i]);
            i++;
        }
        int temp = s.pop();
        while(!s.isEmpty()){
            if(s.peek()>temp)return false;
            else{
                temp = s.pop();
            }
        }
        return true;

    }
}
