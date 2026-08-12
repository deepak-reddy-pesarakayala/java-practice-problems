package practice;
public class NumberOfDigitOne {
    public int countDigitOne(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                if (num % 10 == 1) {
                    count++;
                }
                num = num / 10;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        NumberOfDigitOne obj = new NumberOfDigitOne();
        System.out.println(obj.countDigitOne(13));
    }
}