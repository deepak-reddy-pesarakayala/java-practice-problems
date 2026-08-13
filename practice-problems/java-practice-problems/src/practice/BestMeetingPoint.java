package practice;
import java.util.*;
public class BestMeetingPoint {
    public int minTotalDistance(int[][] grid) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    rows.add(i);
                }
            }
        }
        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1) {
                    cols.add(j);
                }
            }
        }
        int row = rows.get(rows.size() / 2);
        int col = cols.get(cols.size() / 2);
        int distance = 0;
        for (int r : rows) {
            distance += Math.abs(r - row);
        }
        for (int c : cols) {
            distance += Math.abs(c - col);
        }
        return distance;
    }
    public static void main(String[] args) {
        BestMeetingPoint obj = new BestMeetingPoint();
        int[][] grid = {
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0}
        };
        System.out.println(obj.minTotalDistance(grid));
    }
}