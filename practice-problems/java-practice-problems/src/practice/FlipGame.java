package practice;
import java.util.*;
public class FlipGame {
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < currentState.length() - 1; i++) {
            if (currentState.charAt(i) == '+' &&
                    currentState.charAt(i + 1) == '+') {
                char[] chars = currentState.toCharArray();
                chars[i] = '-';
                chars[i + 1] = '-';
                result.add(new String(chars));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FlipGame obj = new FlipGame();
        System.out.println(
                obj.generatePossibleNextMoves("++++")
        );
    }
}