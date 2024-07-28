package Contest2;

import java.util.*;

public class Qusetion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int[] c = new int[1];
        solveNQueens(arr, n - 1, 0, c);
        // System.out.println();
        System.out.println(c[0]);
        sc.close();
    }

    public static void solveNQueens(int[][] arr, int n, int row, int[] c) {

        if (n == 0) {
            c[0] = c[0] + 1;
            return;
        }
        if (row == arr.length) {
            return;
        }

        for (int col = 0; col < arr[0].length; col++) {
            if (isvalid(arr, row, col)) {
                arr[row][col] = 1;
                solveNQueens(arr, n - 1, row + 1, c);
                arr[row][col] = 0;
            }
        }
    }

    private static boolean isvalid(int[][] arr, int row, int col) {
        int r = row;
        int c = col;
        // for col
        for (int j = r; j >= 0; j--) {
            if (arr[j][c] == 1) {
                return false;
            }
        }

        // for RightD
        r = row;
        c = col;
        while (r >= 0 && c < arr[0].length) {
            if (arr[r][c] == 1) {
                return false;
            }
            r--;
            c++;
        }
        // for LeftD
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (arr[r][c] == 1) {
                return false;
            }
            r--;
            c--;

        }

        return true;
    }
}
