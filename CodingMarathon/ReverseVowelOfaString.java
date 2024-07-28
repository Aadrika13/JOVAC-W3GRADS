package CodingMarathon;

public class ReverseVowelOfaString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (isVowel(ch[i]) && isVowel(ch[j])) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            } else if (!isVowel(ch[i])) {
                i++;
            } else if (!isVowel(ch[j])) {
                j--;
            }
        }
        return new String(ch);
    }

    public static boolean isVowel(char ch){
        return (ch == 'a'||ch == 'e'||ch == 'i'||ch=='o'||ch=='u'||ch == 'A'||ch == 'E'||ch == 'I'||ch=='O'||ch=='U');
    }
}
