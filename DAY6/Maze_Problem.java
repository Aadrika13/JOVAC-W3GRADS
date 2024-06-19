package DAY6;

import java.util.*;

public class Maze_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        mazeProblem(0, 0, n, m, "");
        sc.close();
    }

    public static void mazeProblem(int i, int j, int desr, int desc, String ans) {
        if (i == desr - 1 && j == desc - 1) {
            System.out.println(ans);
            return;
        }
        if (i == desr || j == desc) {
            return;
        }
        mazeProblem(i + 1, j, desr, desc, ans + "D ");
        mazeProblem(i, j + 1, desr, desc, ans + "R ");

    }

}
