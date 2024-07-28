package Assignment.Assignment3;

import java.util.Scanner;

public class First_uppercase_letter_in_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char res = firstUppercase(str, 0);
        if (res == 0) {
            System.out.println("No uppercase letter");
        }
        System.out.println(res);
        sc.close();
    }

    public static char firstUppercase(String str, int idx) {
        if (idx == str.length()) {
            return 0;
        }
        if (Character.isUpperCase(str.charAt(idx))) {
            return str.charAt(idx);
        }
        return firstUppercase(str, idx + 1);
    }
}
