package practice;
import java.util.*;
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i;
            int length = 0;
            while (j < words.length &&
                    length + words[j].length() + (j - i) <= maxWidth) {
                length += words[j].length();
                j++;
            }
            StringBuilder line = new StringBuilder();
            if (j == words.length || j - i == 1) {
                for (int k = i; k < j; k++) {
                    if (k > i) {
                        line.append(" ");
                    }
                    line.append(words[k]);
                }
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            } else {
                int spaces = maxWidth - length;
                int gaps = j - i - 1;
                int eachSpace = spaces / gaps;
                int extraSpace = spaces % gaps;
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k < j - 1) {
                        for (int x = 0; x < eachSpace; x++) {
                            line.append(" ");
                        }
                        if (extraSpace > 0) {
                            line.append(" ");
                            extraSpace--;
                        }
                    }
                }
            }
            result.add(line.toString());
            i = j;
        }
        return result;
    }
    public static void main(String[] args) {
        TextJustification obj = new TextJustification();
        String[] words = {
                "This", "is", "an", "example",
                "of", "text", "justification."
        };
        List<String> result =
                obj.fullJustify(words, 16);
        for (String line : result) {
            System.out.println(line);
        }
    }
}