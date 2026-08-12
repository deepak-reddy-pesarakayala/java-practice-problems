package practice;
import java.util.*;
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        return true;
    }
    public static void main(String[] args) {
        HappyNumber obj = new HappyNumber();
        System.out.println(obj.isHappy(19));
        System.out.println(obj.isHappy(2));
    }
}