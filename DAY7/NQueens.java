package DAY7;

import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        int n = 3;
        List<List<String>> ans = solveNQueens(n);
        System.out.println(ans);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[][] board = new int[n][n];
        solveNQueensUtil(board, n, 0, solutions);
        return solutions;
    }

    private static void solveNQueensUtil(int[][] board, int n, int row, List<List<String>> solutions) {
        if (row == n) {
            solutions.add(constructSolution(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 1;
                solveNQueensUtil(board, n, row + 1, solutions);
                board[row][col] = 0;
            }
        }
    }

    private static boolean isValid(int[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
            if (col - row + i >= 0 && board[i][col - row + i] == 1)
                return false;
            if (col + row - i < board.length && board[i][col + row - i] == 1)
                return false;
        }
        return true;
    }

    private static List<String> constructSolution(int[][] board) {
        List<String> solution = new ArrayList<>();
        for (int[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (int cell : row) {
                sb.append(cell == 1 ? 'Q' : '.');
            }
            solution.add(sb.toString());
        }
        return solution;
    }
}
