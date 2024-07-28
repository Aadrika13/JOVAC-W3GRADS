package CodingMarathon;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char ch : s){
            System.out.print(ch+" ");
        }
    }
    public static void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s){
            st.push(ch);
        }
        int i = 0;
        while(!st.isEmpty()){
            s[i]=st.pop();
            i++;
        }
    }
}
