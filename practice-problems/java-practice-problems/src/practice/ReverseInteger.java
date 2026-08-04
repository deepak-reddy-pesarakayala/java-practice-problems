package practice;
public class ReverseInteger {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int num = 1234;
        int result = reverse(num);
        System.out.println("Reversed Number: " + result);
    }
}
