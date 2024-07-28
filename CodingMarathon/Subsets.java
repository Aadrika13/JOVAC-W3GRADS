package CodingMarathon;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = subsets(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subset(nums, list, ans, 0);
        return ans;
    }

    public static void subset(int[] arr, List<Integer> list, List<List<Integer>> ans, int i) {
        ans.add(new ArrayList<>(list));
        for (; i < arr.length; i++) {
            list.add(arr[i]);
            subset(arr, list, ans, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
