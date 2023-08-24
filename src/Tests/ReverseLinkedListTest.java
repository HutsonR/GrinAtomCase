package Tests;

import Solutions.ReverseLinkedList;
import Solutions.ReverseLinkedList.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseLinkedListTest {

    @Test
    public void testReverseList() {
        ListNode originalList = new ListNode(5);
        originalList.next = new ListNode(65);
        originalList.next.next = new ListNode(14);
        originalList.next.next.next = new ListNode(78);

        ListNode reversedList = ReverseLinkedList.reverseList(originalList);

        assertEquals(78, reversedList.val);
        assertEquals(14, reversedList.next.val);
        assertEquals(65, reversedList.next.next.val);
        assertEquals(5, reversedList.next.next.next.val);
    }

    @Test
    public void testReverseListWithSingleNode() {
        ListNode originalList = new ListNode(42);

        ListNode reversedList = ReverseLinkedList.reverseList(originalList);

        assertEquals(42, reversedList.val);
        assertNull(reversedList.next);
    }

    @Test
    public void testReverseListWithMultipleNodes() {
        ListNode originalList = new ListNode(1);
        originalList.next = new ListNode(2);
        originalList.next.next = new ListNode(3);
        originalList.next.next.next = new ListNode(4);

        ListNode reversedList = ReverseLinkedList.reverseList(originalList);

        assertEquals(4, reversedList.val);
        assertEquals(3, reversedList.next.val);
        assertEquals(2, reversedList.next.next.val);
        assertEquals(1, reversedList.next.next.next.val);
    }

    @Test
    public void testReverseListWithNull() {
        assertNull(ReverseLinkedList.reverseList(null));
    }
}

