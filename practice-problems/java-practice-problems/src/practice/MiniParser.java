package practice;
import java.util.*;
public class MiniParser {
    static class NestedInteger {
        Integer value;
        List<NestedInteger> list;
        NestedInteger(int value) {
            this.value = value;
        }
        NestedInteger() {
            list = new ArrayList<>();
        }
        public boolean isInteger() {
            return value != null;
        }
        public Integer getInteger() {
            return value;
        }
        public void add(NestedInteger ni) {
            list.add(ni);
        }
        public List<NestedInteger> getList() {
            return list;
        }
        @Override
        public String toString() {
            if (isInteger()) {
                return String.valueOf(value);
            }
            return list.toString();
        }
    }
    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }
        Stack<NestedInteger> stack = new Stack<>();
        int num = 0;
        int sign = 1;
        boolean hasNumber = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '-') {
                sign = -1;
            }
            else if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                hasNumber = true;
            }
            else if (ch == '[') {
                stack.push(new NestedInteger());
            }
            else if (ch == ',' || ch == ']') {
                if (hasNumber) {
                    stack.peek().add(
                            new NestedInteger(num * sign)
                    );
                    num = 0;
                    sign = 1;
                    hasNumber = false;
                }
                if (ch == ']' && stack.size() > 1) {
                    NestedInteger current = stack.pop();
                    stack.peek().add(current);
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        MiniParser obj = new MiniParser();
        System.out.println(obj.deserialize("[123,[456,[789]]]"));
        System.out.println(obj.deserialize("324"));
    }
}