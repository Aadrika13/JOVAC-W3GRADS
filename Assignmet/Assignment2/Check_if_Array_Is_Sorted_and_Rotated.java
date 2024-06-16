package Assignmet.Assignment2;

import java.util.*;
public class Check_if_Array_Is_Sorted_and_Rotated {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] nums = new int[n];
       for(int i=0;i<n;i++){
        nums[i] = sc.nextInt();
       } 
       System.out.println(check(nums));
       sc.close();
    }
    public static boolean check(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count ++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            count ++;
        }
        return count<=1;
    }
}
