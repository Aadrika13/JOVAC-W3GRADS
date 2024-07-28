package DAY7;

public class String_basics {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);// true

        String c = new String("abc");
        System.out.println(a == c);// false

        String d = "ab" + "c";
        System.out.println(a == d);// true
        System.out.println(a.equals(d));// true
    }
}