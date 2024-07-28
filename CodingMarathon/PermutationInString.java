package CodingMarathon;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";
        System.out.println(checkInclusion(s1,s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];
        for(int i=0;i<s1.length();i++){
            ch1[s1.charAt(i)-'a']++;
            ch2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-s1.length();i++){
            if(isMatch(ch1,ch2)){
                return true;
            }
            ch2[s2.charAt(i)-'a']--;
            ch2[s2.charAt(i+s1.length())-'a']++;
        }
        return isMatch(ch1,ch2);
    }
    public static boolean isMatch(int[] ch1,int[] ch2){
        for(int i=0;i<26;i++){
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }
}
