package practice;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println("New Length = " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}