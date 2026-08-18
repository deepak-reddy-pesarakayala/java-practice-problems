package practice;
public class SwapNodes {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null &&
                current.next.next != null) {
            ListNode first = current.next;
            ListNode second = first.next;
            first.next = second.next;
            second.next = first;
            current.next = second;
            current = first;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        SwapNodes obj = new SwapNodes();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode result = obj.swapPairs(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}