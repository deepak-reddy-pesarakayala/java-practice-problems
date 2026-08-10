package practice;
public class Suffix {
    public String longestCommonSuffix(String[] strs) {
        String suffix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].endsWith(suffix)) {
                suffix = suffix.substring(1);
                if (suffix.length() == 0) {
                    return "";
                }
            }
        }
        return suffix;
    }
    public static void main(String[] args) {
        Suffix obj = new Suffix();
        String[] strs = {
                "running",
                "walking",
                "talking"
        };
        System.out.println(obj.longestCommonSuffix(strs));
    }
}