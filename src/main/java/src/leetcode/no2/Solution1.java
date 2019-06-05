package src.leetcode.no2;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

public class Solution1 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int left = 0;
        ListNode next1 = l1;
        ListNode next2 = l2;
        ListNode result = new ListNode(0);
        ListNode last = result;
        while (next1 != null || next2 != null) {
            int temp1 = 0;
            int temp2 = 0;
            if (next1 != null) {
                temp1 = next1.val;
                next1 = next1.next;
            }
            if (next2 != null) {
                temp2 = next2.val;
                next2 = next2.next;
            }
            int sum = temp1 + temp2 + left;
            left = sum / 10;
            ListNode node = new ListNode(sum % 10);
            last.next = node;
            last = node;
        }
        if (left > 0) {
            last.next = new ListNode(1);
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(9);
        l1.next = l2;


        ListNode l4 = new ListNode(5);

        Solution1 solution1 = new Solution1();

        System.out.println(solution1.addTwoNumbers(l1, l4).toString());
    }

}
