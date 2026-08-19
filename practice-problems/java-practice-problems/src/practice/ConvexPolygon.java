package practice;
import java.util.*;
public class ConvexPolygon {
    public boolean isConvex(List<List<Integer>> points) {
        int n = points.size();
        int direction = 0;
        for (int i = 0; i < n; i++) {
            int[] a = {
                    points.get(i).get(0),
                    points.get(i).get(1)
            };
            int[] b = {
                    points.get((i + 1) % n).get(0),
                    points.get((i + 1) % n).get(1)
            };
            int[] c = {
                    points.get((i + 2) % n).get(0),
                    points.get((i + 2) % n).get(1)
            };
            int cross =
                    (b[0] - a[0]) * (c[1] - b[1])
                            - (b[1] - a[1]) * (c[0] - b[0]);
            if (cross != 0) {
                if (direction == 0) {
                    direction = cross;
                }
                else if ((long) cross * direction < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ConvexPolygon obj = new ConvexPolygon();
        List<List<Integer>> points = Arrays.asList(
                Arrays.asList(0, 0),
                Arrays.asList(0, 1),
                Arrays.asList(1, 1),
                Arrays.asList(1, 0)
        );
        System.out.println(obj.isConvex(points));
    }
}