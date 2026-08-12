package practice;
public class PatchingArray {
    public int minPatches(int[] nums, int n) {
        long reach = 0;
        int patches = 0;
        int i = 0;
        while (reach < n) {
            if (i < nums.length && nums[i] <= reach + 1) {
                reach += nums[i];
                i++;
            } else {
                reach += reach + 1;
                patches++;
            }
        }
        return patches;
    }
    public static void main(String[] args) {
        PatchingArray obj = new PatchingArray();
        int[] nums = {1, 3};
        System.out.println(obj.minPatches(nums, 6));
    }
}