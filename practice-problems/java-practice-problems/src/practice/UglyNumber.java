package practice;
public class UglyNumber {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        UglyNumber obj = new UglyNumber();
        System.out.println(obj.isUgly(6));
        System.out.println(obj.isUgly(7));
    }
}