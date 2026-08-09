package practice;
import java.util.*;
public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        Collections.sort(result, (a, b) ->
                String.valueOf(a).compareTo(String.valueOf(b)));
        return result;
    }
    public static void main(String[] args) {
        LexicographicalNumbers obj =
                new LexicographicalNumbers();
        System.out.println(obj.lexicalOrder(13));
    }
}