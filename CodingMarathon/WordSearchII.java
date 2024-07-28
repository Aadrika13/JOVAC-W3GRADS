package CodingMarathon;

import java.util.*;

public class WordSearchII {
    public static void main(String[] args) {
        char[][] board = {
            {'o','a','a','n'},
            {'e','t','a','e'},
            {'i','h','k','r'},
            {'i','f','l','v'}
        };
        String[] words = {"oath","pea","eat","rain"};
        List<String> result = findWords(board, words);
        for (String word : result) {
            System.out.println(word);
        }
    }
    public static List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (exist(board, word)) {
                result.add(word);
            }
        }
        return result;
    }
    //TLE 
    // public List<String> findWords(char[][] board, String[] words) {
    //     List<String> result = new ArrayList<>();
    //     for (String word : words) {
    //         if (exist(board, word)) {
    //             result.add(word);
    //         }
    //     }
    //     return result;
    // }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] visited = new boolean[board.length][board[0].length];
                if (search(board, i, j, word, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    // private boolean exist(char[][] board, String word) {
    //     for (int i = 0; i < board.length; i++) {
    //         for (int j = 0; j < board[0].length; j++) {
    //             if (search(board, i, j, word, 0)) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean search(char[][] board, int i, int j, String word, int k, boolean[][] visited) {
        if (k == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(k)) {
            return false;
        }
        visited[i][j] = true;
        if (search(board, i + 1, j, word, k + 1, visited) ||
            search(board, i - 1, j, word, k + 1, visited) ||
            search(board, i, j + 1, word, k + 1, visited) ||
            search(board, i, j - 1, word, k + 1, visited)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }

    // private boolean search(char[][] board, int row, int col, String word, int index) {
    //     if (index == word.length()) {
    //         return true;
    //     }
    //     if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) {
    //         return false;
    //     }
    //     char temp = board[row][col];
    //     board[row][col] = '*';
    //     boolean found = search(board, row + 1, col, word, index + 1) ||
    //                     search(board, row - 1, col, word, index + 1) ||
    //                     search(board, row, col + 1, word, index + 1) ||
    //                     search(board, row, col - 1, word, index + 1);
    //     board[row][col] = temp;
    //     return found;
    // }
}
