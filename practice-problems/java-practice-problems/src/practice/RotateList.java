package practice;
public class RotateList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        k = k % length;
        for (int i = 0; i < k; i++) {
            ListNode current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            ListNode last = current.next;
            current.next = null;
            last.next = head;
            head = last;
        }
        return head;
    }
    public static void main(String[] args) {
        RotateList obj = new RotateList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = obj.rotateRight(head, 2);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}