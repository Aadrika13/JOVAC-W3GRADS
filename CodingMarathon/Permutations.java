package CodingMarathon;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> result = permute(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        perm(nums, ans, res);
        return res;
    }

    public static void perm(int[] arr, List<Integer> ans, List<List<Integer>> res) {

        if (ans.size() == arr.length) {
            res.add(new ArrayList<Integer>(ans));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 42) {
                continue;
            }
            ans.add(arr[i]);
            int k = arr[i];
            arr[i] = '*';
            perm(arr, ans, res);
            arr[i] = k;
            ans.remove(ans.size() - 1);
        }
    }
}
