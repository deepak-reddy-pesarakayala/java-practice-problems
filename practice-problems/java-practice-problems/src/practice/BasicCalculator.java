package practice;
import java.util.*;
public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int number = 0;
        int sign = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result += sign * number;
                number = 0;
                int oldSign = stack.pop();
                int oldResult = stack.pop();
                result = oldResult + oldSign * result;
            }
        }
        result += sign * number;
        return result;
    }
    public static void main(String[] args) {
        BasicCalculator obj = new BasicCalculator();
        System.out.println(
                obj.calculate("1 + (2 - 3)")
        );
    }
}