package practice;
import java.util.*;
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() &&
                    nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= k - 1) {
                result[index++] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SlidingWindowMaximum obj =
                new SlidingWindowMaximum();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(
                Arrays.toString(
                        obj.maxSlidingWindow(nums, k)
                )
        );
    }
}