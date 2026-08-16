package practice;
public class StringCompression {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length &&
                    chars[i] == current) {
                count++;
                i++;
            }
            chars[index++] = current;
            if (count > 1) {
                String number = String.valueOf(count);
                for (char c : number.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        StringCompression obj = new StringCompression();
        char[] chars = {
                'a', 'a', 'b', 'b', 'c', 'c', 'c'
        };
        int length = obj.compress(chars);
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i]);
        }
    }
}