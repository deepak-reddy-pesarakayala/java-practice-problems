package practice;
public class SuperPow {
    static final int MOD = 1337;
    public int superPow(int a, int[] b) {
        int result = 1;
        for (int digit : b) {
            result = pow(result, 10);
            result = (result * pow(a, digit)) % MOD;
        }
        return result;
    }
    private int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % MOD;
        }
        return result;
    }
    public static void main(String[] args) {
        SuperPow obj = new SuperPow();
        int a = 2;
        int[] b = {3};
        System.out.println(obj.superPow(a, b));
    }
}