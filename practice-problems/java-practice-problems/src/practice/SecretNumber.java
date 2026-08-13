package practice;
public class SecretNumber {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid;
            }
            if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    static int secret = 6;
    public static int guess(int num) {
        if (num == secret) {
            return 0;
        }
        if (num > secret) {
            return -1;
        }
        return 1;
    }
    public static void main(String[] args) {
        SecretNumber obj = new SecretNumber();
        System.out.println(obj.guessNumber(10));
    }
}