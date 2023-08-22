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
}

