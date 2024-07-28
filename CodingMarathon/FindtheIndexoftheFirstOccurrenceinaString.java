package CodingMarathon;

public class FindtheIndexoftheFirstOccurrenceinaString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }        
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.length()-i<needle.length()){
                    return -1;
                }
                boolean found = true;
                for(int j=0;j<needle.length();j++){
                    if(haystack.charAt(i+j)!= needle.charAt(j)){
                        found = false;
                        break;
                    }
                }
                if(found){
                    return i;
                }
            }
        }
        return -1;
    }
}
