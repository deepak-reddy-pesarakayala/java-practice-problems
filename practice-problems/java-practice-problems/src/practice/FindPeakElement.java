package practice;
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 && nums[i] > nums[i + 1]) {
                return i;
            }
            if (i == nums.length - 1 &&
                    nums[i] > nums[i - 1]) {
                return i;
            }
            if (i > 0 && i < nums.length - 1 &&
                    nums[i] > nums[i - 1] &&
                    nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindPeakElement obj = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};
        System.out.println(obj.findPeakElement(nums));
    }
}