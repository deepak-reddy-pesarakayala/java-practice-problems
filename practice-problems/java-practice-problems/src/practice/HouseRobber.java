package practice;
public class HouseRobber {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev1 = 0;
        for (int money : nums) {
            int current = Math.max(
                    prev1,
                    prev2 + money
            );
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args) {
        HouseRobber obj = new HouseRobber();
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(obj.rob(nums));
    }
}