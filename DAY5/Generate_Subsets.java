package DAY5;

import java.util.*;
public class Generate_Subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        generateSubsets(s,"",0);
        sc.close();
    }
    public static void generateSubsets(String s,String ans,int idx){
        if(idx == s.length()){
            System.out.print(ans+" ");
            return;
        }
        generateSubsets(s, ans, idx+1);
        generateSubsets(s, ans+s.charAt(idx), idx+1);
    }
}
