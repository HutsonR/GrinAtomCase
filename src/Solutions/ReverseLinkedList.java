package Solutions;

/**
 * The ReverseLinkedList class provides methods for reversing a singly linked list.
 */
public class ReverseLinkedList {

    /**
     * Reverses a given singly linked list.
     *
     * @param head The head of the linked list to be reversed.
     * @return The head of the reversed linked list.
     */
    public static ListNode reverseList(ListNode head) {
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

    /**
     * Definition for singly-linked list node.
     */
    public static class ListNode {
        public int val;
        public ListNode next;

        /**
         * Default constructor for a ListNode.
         */
        public ListNode() {}

        /**
         * Constructs a ListNode with a given value.
         *
         * @param val The value of the node.
         */
        public ListNode(int val) {
            this.val = val;
        }

        /**
         * Constructs a ListNode with a given value and the next node.
         *
         * @param val The value of the node.
         * @param next The next node in the linked list.
         */
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

