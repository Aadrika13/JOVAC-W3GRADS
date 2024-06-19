package DAY6;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permuatation(s, "");
        sc.close();
    }

    public static void permuatation(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            permuatation(s.substring(0, i) + s.substring(i + 1), ans + ch);
        }
    }
}
