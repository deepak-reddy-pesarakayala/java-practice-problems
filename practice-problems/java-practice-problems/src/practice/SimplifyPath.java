package practice;
import java.util.*;
public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            }
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String folder : stack) {
            result.append("/").append(folder);
        }
        return result.length() == 0 ? "/" : result.toString();
    }
    public static void main(String[] args) {
        SimplifyPath obj = new SimplifyPath();
        System.out.println(obj.simplifyPath("/home//foo/"));
        System.out.println(obj.simplifyPath("/a/./b/../../c/"));
    }
}