package practice;
import java.util.*;
public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();
        long start = lower;
        for (int num : nums) {
            if (num < start) {
                continue;
            }
            if (num > start) {
                result.add(format(start, (long) num - 1));
            }
            start = (long) num + 1;
        }
        if (start <= upper) {
            result.add(format(start, upper));
        }
        return result;
    }
    private String format(long start, long end) {
        if (start == end) {
            return String.valueOf(start);
        }
        return start + "->" + end;
    }
    public static void main(String[] args) {
        MissingRanges obj = new MissingRanges();
        int[] nums = {0, 1, 3, 50, 75};
        System.out.println(
                obj.findMissingRanges(nums, 0, 99)
        );
    }
}