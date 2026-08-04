package practice;
public class RomantoInteger {
    public static void main(String[] args) {
        String roman = "LVIII";
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            int current = 0;
            if (roman.charAt(i) == 'I') current = 1;
            if (roman.charAt(i) == 'V') current = 5;
            if (roman.charAt(i) == 'X') current = 10;
            if (roman.charAt(i) == 'L') current = 50;
            if (roman.charAt(i) == 'C') current = 100;
            if (roman.charAt(i) == 'D') current = 500;
            if (roman.charAt(i) == 'M') current = 1000;
            if (i < roman.length() - 1) {
                int next = 0;
                if (roman.charAt(i + 1) == 'I') next = 1;
                if (roman.charAt(i + 1) == 'V') next = 5;
                if (roman.charAt(i + 1) == 'X') next = 10;
                if (roman.charAt(i + 1) == 'L') next = 50;
                if (roman.charAt(i + 1) == 'C') next = 100;
                if (roman.charAt(i + 1) == 'D') next = 500;
                if (roman.charAt(i + 1) == 'M') next = 1000;
                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        System.out.println(result);
    }
}