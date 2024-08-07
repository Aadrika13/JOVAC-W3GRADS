package CodingMarathon;

import java.util.*;

public class PartitionLabels {
    public static void main(String[] args) {
        String s = "eccbbbbdec";
        List<Integer> result = partitionLabels(s);
        System.out.println(result);
    }
    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] last = new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a'] = i;
        }   
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            end = Math.max(end,last[s.charAt(i)-'a']);
            if(i==end){
                result.add(end - start +1);
                start = end +1;
            }
        }
        return result;
    }
}
