package practice;
import java.util.*;
public class ValidWordSquare {
    public boolean validWordSquare(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (j >= words.size()) {
                    return false;
                }
                if (i >= words.get(j).length() ||
                        words.get(i).charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidWordSquare obj = new ValidWordSquare();
        List<String> words = Arrays.asList(
                "abcd",
                "bnrt",
                "crmy",
                "dtye"
        );
        System.out.println(obj.validWordSquare(words));
    }
}