package DAY6;

import java.util.*;

public class Subsequence_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subsequence(s, "");
        sc.close();
    }

    public static void subsequence(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        subsequence(s.substring(1), ans + s.charAt(0));
        subsequence(s.substring(1), ans);
    }
}
