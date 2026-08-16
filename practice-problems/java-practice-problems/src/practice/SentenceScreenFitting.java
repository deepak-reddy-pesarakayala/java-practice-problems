package practice;
public class SentenceScreenFitting {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < rows; i++) {
            int used = 0;
            while (used + sentence[index].length() <= cols) {
                used += sentence[index].length();
                used++;
                index++;
                if (index == sentence.length) {
                    count++;
                    index = 0;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        SentenceScreenFitting obj =
                new SentenceScreenFitting();
        String[] sentence = {"hello", "world"};
        System.out.println(
                obj.wordsTyping(sentence, 2, 8)
        );
    }
}