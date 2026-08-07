package practice;
public class ValidNumber {
    public boolean isNumber(String s) {
        String pattern = "[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?";
        return s.matches(pattern);
    }
    public static void main(String[] args) {
        ValidNumber obj = new ValidNumber();
        System.out.println(obj.isNumber("2"));
        System.out.println(obj.isNumber("0089"));
        System.out.println(obj.isNumber("-0.1"));
        System.out.println(obj.isNumber("abc"));
        System.out.println(obj.isNumber("1e"));
    }
}