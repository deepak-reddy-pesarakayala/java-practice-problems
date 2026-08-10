package practice;
import java.util.*;
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        MergeIntervals obj = new MergeIntervals();
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] result = obj.merge(intervals);
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }
}