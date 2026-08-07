package practice;
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int row = 0;
        boolean down = true;
        for (char ch : s.toCharArray()) {
            rows[row].append(ch);
            if (row == 0) {
                down = true;
            }
            else if (row == numRows - 1) {
                down = false;
            }
            if (down) {
                row++;
            } else {
                row--;
            }
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder r : rows) {
            result.append(r);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        ZigZagConversion obj = new ZigZagConversion();
        System.out.println(obj.convert("PAYPALISHIRING", 3));
        System.out.println(obj.convert("PAYPALISHIRING", 4));
    }
}