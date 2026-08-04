package practice;
public class RegularExpressionMatching {
        public static void main(String[] args) {
            String s = "aab";
            String pattern = "a*b";
            if (s.matches(pattern)) {
                System.out.println("Match");
            } else {
                System.out.println("Not Match");
            }
        }
    }

