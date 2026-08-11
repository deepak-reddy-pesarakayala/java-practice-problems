package practice;
import java.util.Arrays;
public class SortedElements {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    public static void main(String[] args) {
        SortedElements obj = new SortedElements();
        int[] nums = {3, 2, 1, 5, 6, 4};
        System.out.println(obj.findKthLargest(nums, 2));
    }
}