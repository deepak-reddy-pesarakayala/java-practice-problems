package practice;
import java.math.BigInteger;
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        return a.multiply(b).toString();
    }
    public static void main(String[] args) {
        MultiplyStrings obj = new MultiplyStrings();
        String result = obj.multiply("123", "456");
        System.out.println(result);
    }
}