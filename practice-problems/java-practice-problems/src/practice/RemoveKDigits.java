package practice;
import java.util.*;
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (char ch : num.toCharArray()) {
            while (!stack.isEmpty()
                    && k > 0
                    && stack.peek() > ch) {
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while (k > 0) {
            stack.pop();
            k--;
        }
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        int i = 0;
        while (i < result.length() && result.charAt(i) == '0') {
            i++;
        }
        result = new StringBuilder(result.substring(i));
        if (result.length() == 0) {
            return "0";
        }
        return result.toString();
    }
    public static void main(String[] args) {
        RemoveKDigits obj = new RemoveKDigits();
        System.out.println(
                obj.removeKdigits("1432219", 3)
        );
        System.out.println(
                obj.removeKdigits("10200", 1)
        );
    }
}