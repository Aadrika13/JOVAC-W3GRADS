package CodingMarathon;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
					if (searchInBoard(board,i,j,0,word)) {
						return true;
					}
				}
			}
            return false;
		}
    private static boolean searchInBoard(char[][] board, int rows, int cols, int index, String word) {
		if (index == word.length()) {
			return true;
		}
		if (rows < 0 || cols < 0 || rows == board.length || cols == board[0].length
				|| board[rows][cols] != word.charAt(index)) {
			return false;
		}
		char ch = board[rows][cols];
		board[rows][cols] = '*';
		
        boolean found = searchInBoard(board, rows + 1, cols, index + 1, word) || searchInBoard(board, rows - 1, cols, index + 1, word) || searchInBoard(board, rows, cols + 1, index + 1, word) || searchInBoard(board, rows, cols - 1, index + 1, word);
		board[rows][cols] = ch;
		return found;
	}
}
