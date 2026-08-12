package practice;
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int max = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    int width = cols;
                    for (int k = i; k >= 0; k--) {
                        if (matrix[k][j] == '0') {
                            break;
                        }
                        int count = 0;
                        for (int x = j; x >= 0; x--) {
                            if (matrix[k][x] == '1') {
                                count++;
                            } else {
                                break;
                            }
                        }
                        width = Math.min(width, count);
                        int height = i - k + 1;
                        max = Math.max(max, width * height);
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        MaximalRectangle obj = new MaximalRectangle();
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        System.out.println(obj.maximalRectangle(matrix));
    }
}