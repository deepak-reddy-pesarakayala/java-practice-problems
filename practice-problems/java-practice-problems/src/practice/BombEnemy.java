package practice;
public class BombEnemy {
    public int maxKilledEnemies(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int max = 0;
        int rowEnemies = 0;
        int[] colEnemies = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j == 0 || grid[i][j - 1] == 'W') {
                    rowEnemies = 0;
                    for (int k = j; k < cols && grid[i][k] != 'W'; k++) {
                        if (grid[i][k] == 'E') {
                            rowEnemies++;
                        }
                    }
                }
                if (i == 0 || grid[i - 1][j] == 'W') {
                    colEnemies[j] = 0;
                    for (int k = i; k < rows && grid[k][j] != 'W'; k++) {
                        if (grid[k][j] == 'E') {
                            colEnemies[j]++;
                        }
                    }
                }
                if (grid[i][j] == '0') {
                    max = Math.max(
                            max,
                            rowEnemies + colEnemies[j]
                    );
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        BombEnemy obj = new BombEnemy();
        char[][] grid = {
                {'0', 'E', '0', '0'},
                {'E', '0', 'W', 'E'},
                {'0', 'E', '0', '0'}
        };
        System.out.println(obj.maxKilledEnemies(grid));
    }
}