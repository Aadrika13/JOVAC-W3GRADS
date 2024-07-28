package CodingMarathon;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "a#c";
        String t = "b";
        System.out.println(backspaceCompare(s,t));
    }
    public static boolean backspaceCompare(String s, String t) {
        return (print(s).equals(print(t)));
    }
    public static String print(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'&&s.charAt(0)!='#'){
                s=s.substring(0,i-1)+s.substring(i+1);
                i-=2;
            }
            else if(s.charAt(i)=='#'&&s.charAt(0)=='#'){
                s=s.substring(1);
                i=-1;
            }
        }
        return s;
    }
}
