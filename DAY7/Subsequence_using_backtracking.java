package DAY7;

import java.util.Stack;

public class Subsequence_using_backtracking {
    public static void main(String[] args) {
        String str = "abc";
        Stack<Character> ans = new Stack<>();
        generateSubstrings(str, ans, 0);
    }

    public static void generateSubstrings(String s, Stack<Character> ans, int i) {
        if (i == s.length()) {
            if (!ans.isEmpty()) {
                for (Character ch : ans) {
                    System.out.print(ch);
                }
                System.out.println();
            }
            return;
        }

        generateSubstrings(s, ans, i + 1);

        ans.push(s.charAt(i));
        generateSubstrings(s, ans, i + 1);

        ans.pop();
    }
}
