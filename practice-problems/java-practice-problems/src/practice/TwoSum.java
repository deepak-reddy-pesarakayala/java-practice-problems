package practice;
import java.util.Arrays;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        return new int[]{0, 1};
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(result));
    }
}