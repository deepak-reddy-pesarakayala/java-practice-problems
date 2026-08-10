package practice;
import java.util.*;
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        StringBuilder result = new StringBuilder();
        k--;
        for (int i = n; i > 0; i--) {
            int fact = 1;
            for (int j = 1; j < i; j++) {
                fact *= j;
            }
            int index = k / fact;
            result.append(numbers.get(index));
            numbers.remove(index);
            k = k % fact;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        PermutationSequence obj = new PermutationSequence();
        System.out.println(obj.getPermutation(3, 4));
    }
}