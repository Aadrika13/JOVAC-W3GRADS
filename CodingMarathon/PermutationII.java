package CodingMarathon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        PermutationII permutationII = new PermutationII();
        System.out.println(permutationII.permuteUnique(nums));
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        boolean[] used = new boolean[nums.length];
        print(nums, used, new ArrayList<>(), result);
        
        return result;
    }
    
    public void print(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue; 
            }
            used[i] = true;
            current.add(nums[i]);
            print(nums, used, current, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
