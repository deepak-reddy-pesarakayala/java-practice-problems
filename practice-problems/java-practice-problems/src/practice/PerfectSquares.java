package practice;
import java.util.*;
public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(
                        dp[i],
                        dp[i - j * j] + 1
                );
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        PerfectSquares obj = new PerfectSquares();
        System.out.println(obj.numSquares(12));
    }
}