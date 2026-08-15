package practice;
import java.util.*;
public class FactorCombinations {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> result = new ArrayList<>();
        findFactors(n, 2, new ArrayList<>(), result);
        return result;
    }
    private void findFactors(int n, int start,
                             List<Integer> list,
                             List<List<Integer>> result) {
        if (!list.isEmpty()) {
            list.add(n);
            result.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
        }
        for (int i = start; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                findFactors(n / i, i, list, result);
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        FactorCombinations obj = new FactorCombinations();
        System.out.println(obj.getFactors(12));
    }
}