package DAY3;

import java.util.*;
public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
        sc.close();
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i]) - 1;

            if(nums[idx]<0){

            }else{
                nums[idx] *= -1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                list.add(i+1);
            }
        }
        return list;
    }
}
