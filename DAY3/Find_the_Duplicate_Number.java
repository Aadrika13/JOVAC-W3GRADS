package DAY3;

import java.util.Scanner;

public class Find_the_Duplicate_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans = findDuplicate(nums);
        System.out.println(ans);
        sc.close();
    }
    public static int findDuplicate(int[] nums) {
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx]<0){
                ans = idx + 1;
                break;
            }
            else{
                nums[idx] *= -1;
            }
        }
        return ans;
    }
}
