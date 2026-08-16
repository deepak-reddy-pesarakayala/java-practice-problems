package practice;
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int current = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] ==
                    nums[i - 1] - nums[i - 2]) {
                current++;
                count += current;
            } else {
                current = 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArithmeticSlices obj = new ArithmeticSlices();
        int[] nums = {1, 2, 3, 4};
        System.out.println(obj.numberOfArithmeticSlices(nums));
    }
}