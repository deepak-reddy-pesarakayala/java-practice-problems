package practice;
public class PaintFence {
    public int numWays(int n, int k) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        int same = k;
        int different = k * (k - 1);
        for (int i = 3; i <= n; i++) {
            int newSame = different;
            int newDifferent = (same + different) * (k - 1);
            same = newSame;
            different = newDifferent;
        }
        return same + different;
    }
    public static void main(String[] args) {
        PaintFence obj = new PaintFence();
        System.out.println(obj.numWays(3, 2));
    }
}