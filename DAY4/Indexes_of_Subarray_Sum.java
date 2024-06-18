package DAY4;

import java.util.*;
public class Indexes_of_Subarray_Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int [] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> ans = subarraySum(nums,n,s);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        sc.close();

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