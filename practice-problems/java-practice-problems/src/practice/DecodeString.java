package practice;
import java.util.*;
public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> strings = new Stack<>();
        String result = "";
        int number = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }
            else if (ch == '[') {
                numbers.push(number);
                strings.push(result);
                number = 0;
                result = "";
            }
            else if (ch == ']') {
                int count = numbers.pop();
                String previous = strings.pop();
                String temp = "";
                for (int i = 0; i < count; i++) {
                    temp += result;
                }
                result = previous + temp;
            }
            else {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        DecodeString obj = new DecodeString();
        System.out.println(obj.decodeString("3[a]2[bc]"));
        System.out.println(obj.decodeString("3[a2[c]]"));
    }
}