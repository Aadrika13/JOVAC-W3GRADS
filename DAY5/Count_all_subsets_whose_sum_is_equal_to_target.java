package DAY5;

import java.util.*;
public class Count_all_subsets_whose_sum_is_equal_to_target {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int target = sc.nextInt();
    static int [] arr = new int[n];
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        // int target = sc.nextInt();
        int count = countSubsets(arr.length-1,0);
        System.out.println(count);
    }

    private static int countSubsets(int idx, int sum) {
        if(idx==-1){
            return (sum==target)?1:0;
        }
        int in = countSubsets(idx-1, sum+arr[idx]);
        int ex = countSubsets(idx-1, sum);
        return in + ex;
    }

    /*private static int countSubsets(int[] arr, int target, int i) {
        if(i==arr.length){
            if(target==0){
                return 1;
            }
            return 0;
        }
        int in = countSubsets(arr,target-arr[i],i+1);
        int ex = countSubsets(arr,target,i+!);
        return in + ex;
    }*/
}
