package practice;
public class MaximumPoints {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        max = sum;
        for (int i = 1; i <= k; i++) {
            sum = sum
                    - cardPoints[k - i]
                    + cardPoints[n - i];
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        MaximumPoints obj = new MaximumPoints();
        int[] cards = {1, 2, 3, 4, 5, 6, 1};
        System.out.println(obj.maxScore(cards, 3));
    }
}