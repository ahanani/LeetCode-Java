package SumOfLinkedLists;
/**
 * Represents a node in a singly-linked list.
 * 
 * @author: Abdullah Hanani
 * @date: 2023-04-17
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() { // default constructor
    }

    ListNode(int val) { // constructor with value
        this.val = val;
    }

    ListNode(int val, ListNode next) { // constructor with value and next node
        this.val = val;
        this.next = next;
    }
}
