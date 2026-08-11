package practice;
import java.util.*;
public class DuplicateEmails {
    public static void main(String[] args) {
        String[] emails = {
                "a@gmail.com",
                "b@gmail.com",
                "a@gmail.com",
                "c@gmail.com",
                "b@gmail.com"
        };
        Set<String> seen = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        for (String email : emails) {
            if (!seen.add(email)) {
                duplicate.add(email);
            }
        }
        System.out.println(duplicate);
    }
}