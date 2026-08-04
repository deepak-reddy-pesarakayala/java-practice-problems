package practice;
public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        String str = String.valueOf(num);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}