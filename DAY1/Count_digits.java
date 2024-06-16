package DAY1;
import java.util.*;

public class Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while(a != 0){
            count++;
            a /= 10;
        }
        System.out.println(count);
        sc.close();
    }
}
