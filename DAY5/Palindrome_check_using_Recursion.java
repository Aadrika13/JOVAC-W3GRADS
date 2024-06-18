package DAY5;

import java.util.*;
public class Palindrome_check_using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(isPalindrome(s,"",s.length()));
        sc.close();
    }
    public static boolean isPalindrome(String s,String ans,int i){
        if(i < 0){
            return false;
        }
        if(s.equals(ans)){
            return true;
        }
        return isPalindrome(s, ans+s.charAt(i), i-1);
    }
}