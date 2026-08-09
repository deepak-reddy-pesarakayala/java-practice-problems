package practice;
public class NthDigit {
    public int findNthDigit(int n) {
        long digit = 1;
        long count = 9;
        long start = 1;
        while (n > digit * count) {
            n -= digit * count;
            digit++;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / digit;
        String number = String.valueOf(start);
        return number.charAt((int) ((n - 1) % digit)) - '0';
    }
    public static void main(String[] args) {
        NthDigit obj = new NthDigit();
        System.out.println(obj.findNthDigit(3));
        System.out.println(obj.findNthDigit(10));
        System.out.println(obj.findNthDigit(11));
    }
}