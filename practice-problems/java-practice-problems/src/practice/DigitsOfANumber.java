package practice;
public class DigitsOfANumber {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
    public static void main(String[] args) {
        DigitsOfANumber obj = new DigitsOfANumber();
        System.out.println(obj.addDigits(38));
    }
}