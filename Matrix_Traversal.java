import java.util.*;

public class Matrix_Traversal {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 0, 1, 1, 0 },
                { 1, 0, 1, 1, 0 },
                { 1, 1, 1, 0, 0 },
                { 1, 0, 1, 0, 1 }
        };
        int rows = mat.length;
        int cols = mat[0].length;
        // boolean[][] visited = new boolean[rows][cols];
        // dfs_mat(mat, rows, cols, rows - 1, cols - 1, visited);
        // System.out.println();
        System.out.println(complete_bfs(mat, rows, cols));
    }

    public static void dfs_mat(int[][] mat, int rows, int cols, int x, int y, boolean[][] visited) {
        visited[x][y] = true;
        System.out.print(mat[x][y] + " ");

        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };

        for (int i = 0; i < 4; i++) {
            int new_x = x + dx[i];
            int new_y = y + dy[i];

            if (new_x >= 0 && new_x < rows && new_y >= 0 && new_y < cols && !visited[new_x][new_y]) {
                dfs_mat(mat, rows, cols, new_x, new_y, visited);
            }
        }
    }

    public static void dfs_all(int[][] mat, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    dfs_mat(mat, rows, cols, i, j, visited);
                }
            }
        }
    }

    public static void bfs_mat(int[][] mat, int rows, int cols, int x, int y, boolean[][] visited) {

        // boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> q = new LinkedList<>();

        visited[x][y] = true;
        q.add(new int[] { x, y });

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int curr_x = curr[0];
            int curr_y = curr[1];

            // System.out.print(mat[curr_x][curr_y] + " "); // values
            // System.out.print("(" + curr_x + ", " + curr_y + ")");// indices

            int[] dx = { 0, 1, 0, -1 };
            int[] dy = { 1, 0, -1, 0 };

            for (int i = 0; i < 4; i++) {
                int nbr_x = curr_x + dx[i];
                int nbr_y = curr_y + dy[i];

                if (nbr_x >= 0 && nbr_x < rows && nbr_y >= 0 && nbr_y < cols && !visited[nbr_x][nbr_y]
                        && mat[nbr_x][nbr_y] == 1) {
                    visited[nbr_x][nbr_y] = true;
                    q.add(new int[] { nbr_x, nbr_y });
                }
            }
        }
    }

    public static int complete_bfs(int[][] mat, int rows, int cols) {
        boolean[][] visited = new boolean[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j] && mat[i][j] == 1) {
                    visited[i][j] = true;
                    bfs_mat(mat, rows, cols, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

}
