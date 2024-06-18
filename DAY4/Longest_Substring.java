package DAY4;

import java.util.*;
public class Longest_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
        sc.close();
    
    }
    public static int lengthOfLongestSubstring(String s) {
        int max_size = 0;
        int start = 0;
        int end = 0;

        int [] arr = new int [256];

        while(end != s.length()){

            //GROW
            int idx = s.charAt(end);
            arr[idx]++;

            //SHRINK
            while(arr[idx]==2){
                int r_idx = s.charAt(start);
                arr[r_idx]--;
                start++;
            }

            //TASK
            int curr_size = end - start + 1;
            max_size = Math.max(curr_size,max_size);
            end++;
        }
        return max_size;
    }

}
