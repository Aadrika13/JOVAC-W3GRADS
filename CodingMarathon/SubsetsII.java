package CodingMarathon;

import java.util.*;

public class SubsetsII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        List<List<Integer>> result = subsetsWithDup(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums, list, ans, 0);
        return ans;
    }

    public static void subsets(int[] arr, List<Integer> list, List<List<Integer>> ans, int x) {
        ans.add(new ArrayList<>(list));
        for (int i = x; i < arr.length; i++) {
            if (i != x && arr[i] == arr[i - 1])
                continue;
            list.add(arr[i]);
            subsets(arr, list, ans, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
