package practice;
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return (char) result;
    }
    public static void main(String[] args) {
        FindTheDifference obj = new FindTheDifference();
        System.out.println(
                obj.findTheDifference("abcd", "abcde")
        );
    }
}