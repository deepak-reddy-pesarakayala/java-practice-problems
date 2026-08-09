package practice;
import java.util.*;
public class RandomNumber {
    int[] nums;
    Random random = new Random();
    public RandomNumber(int[] nums) {
        this.nums = nums;
    }
    public int pick(int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list.get(random.nextInt(list.size()));
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3};
        RandomNumber obj = new RandomNumber(nums);
        System.out.println(obj.pick(3));
    }
}