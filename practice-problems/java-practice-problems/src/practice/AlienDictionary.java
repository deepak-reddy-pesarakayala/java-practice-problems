package practice;
import java.util.*;
public class AlienDictionary {
    public String alienOrder(String[] words) {
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new ArrayList<>());
                indegree.putIfAbsent(c, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];
            int len = Math.min(w1.length(), w2.length());
            boolean found = false;
            for (int j = 0; j < len; j++) {
                char a = w1.charAt(j);
                char b = w2.charAt(j);
                if (a != b) {
                    graph.get(a).add(b);
                    indegree.put(b, indegree.get(b) + 1);
                    found = true;
                    break;
                }
            }
            if (!found && w1.length() > w2.length()) {
                return "";
            }
        }
        Queue<Character> queue = new LinkedList<>();
        for (char c : indegree.keySet()) {
            if (indegree.get(c) == 0) {
                queue.add(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!queue.isEmpty()) {
            char current = queue.poll();
            result.append(current);
            for (char next : graph.get(current)) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0) {
                    queue.add(next);
                }
            }
        }
        if (result.length() != indegree.size()) {
            return "";
        }
        return result.toString();
    }
    public static void main(String[] args) {
        AlienDictionary obj = new AlienDictionary();
        String[] words = {
                "wrt",
                "wrf",
                "er",
                "ett",
                "rftt"
        };
        System.out.println(obj.alienOrder(words));
    }
}