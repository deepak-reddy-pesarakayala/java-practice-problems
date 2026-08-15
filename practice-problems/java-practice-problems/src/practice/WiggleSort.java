package practice;
import java.util.Arrays;
public class WiggleSort {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i += 2) {
            if (i < nums.length &&
                    nums[i] < nums[i - 1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
            if (i + 1 < nums.length &&
                    nums[i] < nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        WiggleSort obj = new WiggleSort();
        int[] nums = {3, 5, 2, 1, 6, 4};
        obj.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}