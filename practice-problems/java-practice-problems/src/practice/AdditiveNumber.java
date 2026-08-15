package practice;
public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n - 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                break;
            }
            long first = Long.parseLong(num.substring(0, i));
            for (int j = i + 1; j <= n - 1; j++) {
                if (num.charAt(i) == '0' && j - i > 1) {
                    break;
                }
                long second = Long.parseLong(num.substring(i, j));
                if (check(num, j, first, second)) {
                    return true;
                }
            }
        }
        return false;
    }
    private boolean check(String num, int index,
                          long first, long second) {
        while (index < num.length()) {
            long sum = first + second;
            String s = String.valueOf(sum);
            if (!num.startsWith(s, index)) {
                return false;
            }
            index += s.length();
            first = second;
            second = sum;
        }
        return true;
    }
    public static void main(String[] args) {
        AdditiveNumber obj = new AdditiveNumber();
        System.out.println(obj.isAdditiveNumber("112358"));
        System.out.println(obj.isAdditiveNumber("199100199"));
    }
}