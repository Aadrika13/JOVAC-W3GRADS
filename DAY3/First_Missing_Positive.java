package DAY3;

import java.util.Scanner;

public class First_Missing_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
        sc.close();
    }
    public static int firstMissingPositive(int[] nums) {
        boolean isOnePresent = false;

        for(int i=0;i<nums.length;i++){
            if(nums[i] <= 0 || nums[i] > nums.length){
                nums[i] = 1; 
            }else if(nums[i] == 1){
                isOnePresent = true;
            }
        }

        if(!isOnePresent){
            return 1;
        }

        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i]) - 1;

            if(nums[idx] > 0){
                nums[idx] *= -1;
            }
        }

        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans = i+1;
                break;
            }
        }
        return ans == 0? nums.length + 1: ans;
    }
}
