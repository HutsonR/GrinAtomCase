package Solutions;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void test() {
        ListNode list = new ListNode(5);
        list.next = new ListNode(65);
        list.next.next = new ListNode(14);
        list.next.next.next = new ListNode(78);

        System.out.print("Список до изменения: ");
        printList(list);
        System.out.println(); // переход на новую строку
        list = reverseList(list);
        System.out.print("Список после изменения: ");
        printList(list);
        System.out.println();
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
        head = prev;
        return head;
    }

    private static void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    private static class ListNode {
      private int val;
      private ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
