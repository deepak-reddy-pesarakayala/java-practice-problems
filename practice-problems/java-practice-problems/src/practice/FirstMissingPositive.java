package practice;
import java.util.Arrays;
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int number = 1;
        for (int num : nums) {
            if (num == number) {
                number++;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        FirstMissingPositive obj = new FirstMissingPositive();
        int[] nums = {3, 4, -1, 1};
        System.out.println(
                obj.firstMissingPositive(nums)
        );
    }
}