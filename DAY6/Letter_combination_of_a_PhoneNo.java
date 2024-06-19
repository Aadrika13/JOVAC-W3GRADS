package DAY6;

import java.util.*;

public class Letter_combination_of_a_PhoneNo {
    static String[] str = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();
        List<String> ans = letterCombination(digits);
        System.out.println(ans);
        sc.close();
    }

    public static List<String> letterCombination(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        combination(digits, "", list);
        return list;
    }

    public static void combination(String digits, String ans, List<String> list) {
        if (digits.length() == 0) {
            list.add(ans);
            return;
        }
        int dig = digits.charAt(0) - '0';
        String curr = str[dig];

        for (int i = 0; i < curr.length(); i++) {
            char ch = curr.charAt(i);
            combination(digits.substring(1), ans + ch, list);
        }
    }

}
