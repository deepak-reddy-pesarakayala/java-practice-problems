package practice;
import java.util.*;
public class RankScores {
    public static void main(String[] args) {
        int[] scores = {10, 3, 8, 9, 4};
        Integer[] arr = Arrays.stream(scores)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int rank = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && !arr[i].equals(arr[i - 1])) {
                rank = i + 1;
            }
            System.out.println(
                    arr[i] + " -> Rank " + rank
            );
        }
    }
}