import java.util.LinkedList;

public class ReverseLinkedList {
    public static void test() {
        ListNode list = new ListNode(5);
        list.next = new ListNode(65);
        list.next.next = new ListNode(14);
        list.next.next.next = new ListNode(78);

        System.out.println(reverseList(list).toString());
    }

    private static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;

        }

        return prev;
    }

    private static class ListNode {
      private int val;
      private ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
