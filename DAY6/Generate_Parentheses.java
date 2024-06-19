package DAY6;

import java.util.*;

public class Generate_Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ans = generateParenthesis(n);
        System.out.println(ans);
        sc.close();

    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        print(n, 0, 0, "", list);
        return list;
    }

    public static void print(int n, int open, int close, String ans, List<String> list) {
        if (open == n && close == n) {
            list.add(ans);
            return;
        }
        if (open < n) {
            print(n, open + 1, close, ans + "(", list);
        }
        if (close < open) {
            print(n, open, close + 1, ans + ")", list);
        }
    }
}
