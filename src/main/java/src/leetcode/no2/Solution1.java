package src.leetcode.no2;

import java.util.List;

public class Solution1 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long i = 0;
        long num1 = 0;
        long num2 = 0;
        ListNode next1 = l1;
        ListNode next2 = l2;
        while (next1 != null || next2 != null) {
            if (next1 != null) {
                num1 = next1.val * (long) Math.pow(10, i) + num1;
                next1 = next1.next;
            }
            if (next2 != null) {
                num2 = next2.val * (long) Math.pow(10, i) + num2;

                next2 = next2.next;
            }
            i++;
        }
        System.out.println(num1);
        System.out.println(num2 + num1);
        char[] result = String.valueOf(num1 + num2).toCharArray();
        ListNode node = new ListNode(Integer.parseInt(result[result.length - 1] + ""));
        ListNode last = node;
        for (int j = result.length - 2; j >= 0; j--) {
            String temp = String.valueOf(result[j]);
            ListNode node1 = new ListNode(Integer.parseInt(temp));
            System.out.println(node1.val);
            last.next = node1;
            last = node1;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l1.next = l2;


        ListNode l4 = new ListNode(9);

        long a  = 9223372036854775808l;
        Solution1 solution1 = new Solution1();

        System.out.println(solution1.addTwoNumbers(l1, l4).toString());
    }

}
