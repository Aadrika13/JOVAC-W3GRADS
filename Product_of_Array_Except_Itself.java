package DAY4;

import java.util.*;

public class Product_of_Array_Except_Itself {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] ans = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] nums) {
        //extra space
        // int [] l = new int[nums.length];
        // l[0]=1;
        // for(int i = 1;i<nums.length;i++){
        //     l[i] = l[i-1]*nums[i-1];
        // }

        // int [] r = new int[nums.length];
        // r[nums.length-1]=1;
        // for(int i = nums.length-2;i>=0;i--){
        //     r[i] = r[i+1]*nums[i+1];
        // }

        // int [] ans = new int [nums.length];
        // for (int i = 0; i < ans.length; i++) {
        //     ans[i] = l[i]*r[i];
        // }

        // return ans;

        //optimal approach
        int [] ans = new int [nums.length];
        ans[0] = 1;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1]*nums[i-1];
        }
        int p = 1;
        for (int i = ans.length-2; i >= 0; i++) {
            p = p*ans[i+1];
            ans[i] = ans [i] * p;
        }
        return ans;
    }
}
