package practice;
import java.util.*;
public class PerfectRectangle {
    public boolean isRectangleCover(int[][] rectangles) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int area = 0;
        Set<String> set = new HashSet<>();
        for (int[] r : rectangles) {
            int x1 = r[0];
            int y1 = r[1];
            int x2 = r[2];
            int y2 = r[3];
            minX = Math.min(minX, x1);
            minY = Math.min(minY, y1);
            maxX = Math.max(maxX, x2);
            maxY = Math.max(maxY, y2);
            area += (x2 - x1) * (y2 - y1);
            String[] corners = {
                    x1 + "," + y1,
                    x1 + "," + y2,
                    x2 + "," + y1,
                    x2 + "," + y2
            };
            for (String corner : corners) {
                if (set.contains(corner)) {
                    set.remove(corner);
                } else {
                    set.add(corner);
                }
            }
        }
        int totalArea = (maxX - minX) * (maxY - minY);
        if (area != totalArea) {
            return false;
        }
        return set.size() == 4;
    }
    public static void main(String[] args) {
        PerfectRectangle obj = new PerfectRectangle();
        int[][] rectangles = {
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {3, 2, 4, 4},
                {1, 3, 2, 4},
                {2, 2, 4, 4}
        };
        System.out.println(
                obj.isRectangleCover(rectangles)
        );
    }
}