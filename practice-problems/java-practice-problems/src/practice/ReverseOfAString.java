package practice;
public class ReverseOfAString {
    public String reverse(String s) {
        StringBuilder result = new StringBuilder(s);
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        ReverseOfAString obj = new ReverseOfAString();
        System.out.println(obj.reverse("hello"));
    }
}