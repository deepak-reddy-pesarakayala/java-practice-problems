package practice;
class GenerateParentheses {
    public static void generate(String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }
        if (open < n) {
            generate(s + "(", open + 1, close, n);
        }
        if (close < open) {
            generate(s + ")", open, close + 1, n);
        }
    }
    public static void main(String[] args) {
        generate("", 0, 0, 3);
    }
}