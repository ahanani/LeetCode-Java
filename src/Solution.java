/**
 * Takes two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a
 * single digit.
 * Add the two numbers and return it as a linked list in reverse.
 * 
 * @author: Abdullah Hanani
 * @date: 2023-04-17
 */
class Solution {
    /**
     * Adds two numbers represented by linked lists
     * 
     * @param l1 must be non-empty linked list
     * @param l2 must be non-empty linked list
     * @return the sum of the two numbers represented by the linked lists
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { // Adds two numbers represented by linked lists
        StringBuilder sb1 = new StringBuilder(); // StringBuilder to store the first number
        StringBuilder sb2 = new StringBuilder(); // StringBuilder to store the second number

        ListNode headL1 = l1; // extrct the first number
        while (headL1.next != null) {
            sb1.append(headL1.val);
            headL1 = headL1.next;
        }

        sb1.append(headL1.val);
        sb1.reverse(); // reverse the number

        ListNode headL2 = l2; // extract the second number
        while (headL2.next != null) {
            sb2.append(headL2.val);
            headL2 = headL2.next;
        }

        sb2.append(headL2.val);
        sb2.reverse(); // reverse the number

        Integer sum = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString()); // add the two numbers
        String sumStr = sum.toString(); // convert the sum to a string
        int size = sumStr.length(); // get the length of the sum

        ListNode head = new ListNode(Integer.parseInt(String.valueOf(sumStr.charAt(size - 1)))); // create the head of
                                                                                                 // the result linked
                                                                                                 // list
        ListNode headCopy = head; // copy the head to a new variable
        size--;

        while (size > 0) { // create the rest of the linked list
            headCopy.next = new ListNode(Integer.parseInt(String.valueOf(sumStr.charAt(size - 1))));
            headCopy = headCopy.next;
            size--;
        }

        return head; // return the head of the linked list
    }

    /**
     * Main method
     * 
     * @param args unused
     */
    public static void main(String[] args) { // runs the program
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(new ListNode(1, new ListNode(2, new ListNode(3))),
                new ListNode(4, new ListNode(5, new ListNode(6))));

        while (result.next != null) {
            System.out.print(result.val);
            result = result.next;
        }

        System.out.print(result.val);
    }
}