package DAY4;

import java.util.*;
public class Indexes_of_Subarray_Sum{
    public static void main(String[] args) {
        int n = 5;
        int s = 12;
        int [] arr = {1,2,3,4,5};
        ArrayList<Integer> ans = subarraySum(arr,n,s);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int curr_sum = arr[0];
        int start = 0;
        for(int end = 1; end <= n; end++){
            while(curr_sum > s && start < (end - 1)){
                curr_sum -= arr[start];
                start++;
            }
            if(curr_sum == s){
                // int p = end - 1;
                ans.add(start+1);
                ans.add(end);
                return ans;
            }
            if(end < n){
                curr_sum += arr[end];
            }
        }
        ans.add(-1);
        return ans;
    }
}