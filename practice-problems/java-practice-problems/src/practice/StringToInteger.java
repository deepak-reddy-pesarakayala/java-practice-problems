package practice;
public class StringToInteger {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        }
        int sign = 1;
        int i = 0;
        int result = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
    public static void main(String[] args) {
        StringToInteger obj = new StringToInteger();
        System.out.println(obj.myAtoi("42"));
        System.out.println(obj.myAtoi("-42"));
        System.out.println(obj.myAtoi("123"));
    }
}