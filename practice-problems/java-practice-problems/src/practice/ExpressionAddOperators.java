package practice;
import java.util.*;
public class ExpressionAddOperators {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        solve(num, target, 0, 0, 0, "", result);
        return result;
    }
    private void solve(String num, long target, int index,
                       long value, long previous,
                       String expression, List<String> result) {
        if (index == num.length()) {
            if (value == target) {
                result.add(expression);
            }
            return;
        }
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') {
                break;
            }
            String part = num.substring(index, i + 1);
            long number = Long.parseLong(part);
            if (index == 0) {
                solve(num, target, i + 1,
                        number, number,
                        part, result);
            } else {
                solve(num, target, i + 1,
                        value + number,
                        number,
                        expression + "+" + part,
                        result);
                solve(num, target, i + 1,
                        value - number,
                        -number,
                        expression + "-" + part,
                        result);
                solve(num, target, i + 1,
                        value - previous + previous * number,
                        previous * number,
                        expression + "*" + part,
                        result);
            }
        }
    }
    public static void main(String[] args) {
        ExpressionAddOperators obj =
                new ExpressionAddOperators();
        System.out.println(
                obj.addOperators("123", 6)
        );
    }
}