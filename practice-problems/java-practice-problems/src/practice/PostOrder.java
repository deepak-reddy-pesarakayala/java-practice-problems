package practice;
import java.util.*;
public class PostOrder {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        return result;
    }
    private void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
    public static void main(String[] args) {
        PostOrder obj = new PostOrder();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(obj.postorderTraversal(root));
    }
}