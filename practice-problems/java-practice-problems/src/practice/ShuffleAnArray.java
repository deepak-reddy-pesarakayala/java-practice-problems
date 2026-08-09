package practice;
import java.util.*;
public class ShuffleAnArray {
    int[] nums;
    ShuffleAnArray(int[] nums) {
        this.nums = nums;
    }
    public int[] reset() {
        return nums;
    }
    public int[] shuffle() {
        int[] arr = nums.clone();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        ShuffleAnArray obj = new ShuffleAnArray(nums);
        System.out.println(Arrays.toString(obj.shuffle()));
        System.out.println(Arrays.toString(obj.reset()));
    }
}