package practice;
import java.util.*;
public class RandomPickIndex {
    int[] nums;
    Random random = new Random();
    public RandomPickIndex(int[] nums) {
        this.nums = nums;
    }
    public int pick(int target) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indexes.add(i);
            }
        }
        return indexes.get(
                random.nextInt(indexes.size())
        );
    }
    public static void main(String[] args) {
        RandomPickIndex obj =
                new RandomPickIndex(new int[]{1, 2, 3, 3, 3});
        System.out.println(obj.pick(3));
    }
}