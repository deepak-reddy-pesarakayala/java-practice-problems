package practice;
import java.util.*;
public class MaxPointsOnALine {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) {
            return points.length;
        }
        int answer = 0;
        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            int same = 1;
            int max = 0;
            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                if (dx == 0 && dy == 0) {
                    same++;
                    continue;
                }
                int gcd = gcd(Math.abs(dx), Math.abs(dy));
                dx = dx / gcd;
                dy = dy / gcd;
                String slope = dx + "/" + dy;
                map.put(
                        slope,
                        map.getOrDefault(slope, 0) + 1
                );
                max = Math.max(max, map.get(slope));
            }
            answer = Math.max(answer, max + same);
        }
        return answer;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        MaxPointsOnALine obj = new MaxPointsOnALine();
        int[][] points = {
                {1, 1},
                {2, 2},
                {3, 3}
        };
        System.out.println(obj.maxPoints(points));
    }
}