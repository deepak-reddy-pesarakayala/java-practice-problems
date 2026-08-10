package practice;
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
    public static void main(String[] args) {
        SearchInsertPosition obj = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        System.out.println(obj.searchInsert(nums, 5));
        System.out.println(obj.searchInsert(nums, 2));
        System.out.println(obj.searchInsert(nums, 7));
    }
}