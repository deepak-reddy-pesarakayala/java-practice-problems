package practice;
import java.util.*;
public class LineReflection {
    public boolean isReflected(int[][] points) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        Set<String> set = new HashSet<>();
        for (int[] point : points) {
            minX = Math.min(minX, point[0]);
            maxX = Math.max(maxX, point[0]);
            set.add(point[0] + "," + point[1]);
        }
        int sum = minX + maxX;
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int reflectedX = sum - x;
            if (!set.contains(reflectedX + "," + y)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LineReflection obj = new LineReflection();
        int[][] points = {
                {1, 1},
                {3, 1}
        };
        System.out.println(obj.isReflected(points));
    }
}