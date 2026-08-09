package practice;
import java.util.*;
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(ch) && !map.get(ch).equals(word)) {
                return false;
            }
            if (reverseMap.containsKey(word) &&
                    reverseMap.get(word) != ch) {
                return false;
            }
            map.put(ch, word);
            reverseMap.put(word, ch);
        }
        return true;
    }
    public static void main(String[] args) {
        WordPattern obj = new WordPattern();
        System.out.println(
                obj.wordPattern("abba", "dog cat cat dog")
        );
        System.out.println(
                obj.wordPattern("abba", "dog cat cat fish")
        );
    }
}