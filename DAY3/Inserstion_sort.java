package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class Inserstion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        insertionSort(nums,n);
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
    public static void insertionSort(int [] nums,int n){
        for (int i = 0; i < n; i++) {
            int p = i;
            while(p > 0 && nums[p] < nums[p-1]){
                swap(nums,p,p-1);
                p--;
            }            
        }
    }
    public static void swap(int[] nums,int p1,int p2){
        int temp = nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
    
}
