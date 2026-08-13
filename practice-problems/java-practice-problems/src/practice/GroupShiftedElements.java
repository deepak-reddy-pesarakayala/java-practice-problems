package practice;
import java.util.*;
public class GroupShiftedElements {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            String key = "";
            for (int i = 1; i < s.length(); i++) {
                int diff = s.charAt(i) - s.charAt(i - 1);
                if (diff < 0) {
                    diff += 26;
                }
                key += diff + "#";
            }
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        GroupShiftedElements obj =
                new GroupShiftedElements();
        String[] strings = {
                "abc", "bcd", "ace", "xyz", "az"
        };
        System.out.println(obj.groupStrings(strings));
    }
}