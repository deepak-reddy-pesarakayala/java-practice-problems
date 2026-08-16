package practice;
import java.util.*;
public class FindRightInterval {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] result = new int[n];
        int[][] starts = new int[n][2];
        for (int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }
        Arrays.sort(starts, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            int end = intervals[i][1];
            int left = 0;
            int right = n - 1;
            int answer = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (starts[mid][0] >= end) {
                    answer = starts[mid][1];
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            result[i] = answer;
        }
        return result;
    }
    public static void main(String[] args) {
        FindRightInterval obj = new FindRightInterval();
        int[][] intervals = {
                {1, 2},
                {2, 3},
                {3, 4}
        };
        System.out.println(
                Arrays.toString(
                        obj.findRightInterval(intervals)
                )
        );
    }
}