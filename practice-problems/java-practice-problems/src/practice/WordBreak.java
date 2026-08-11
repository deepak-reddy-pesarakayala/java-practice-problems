package practice;
import java.util.*;
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                int length = word.length();
                if (i >= length &&
                        dp[i - length] &&
                        s.substring(i - length, i).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        WordBreak obj = new WordBreak();
        String s = "moviemakers";
        List<String> wordDict =
                Arrays.asList("movie", "makers");
        System.out.println(
                obj.wordBreak(s, wordDict)
        );
    }
}