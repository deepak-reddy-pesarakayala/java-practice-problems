package practice;
public class IntegerReplacement {
    public int integerReplacement(int n) {
        long num = n;
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                if (num == 3 || num % 4 == 1) {
                    num = num - 1;
                } else {
                    num = num + 1;
                }
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        IntegerReplacement obj = new IntegerReplacement();
        System.out.println(obj.integerReplacement(8));
        System.out.println(obj.integerReplacement(7));
    }
}