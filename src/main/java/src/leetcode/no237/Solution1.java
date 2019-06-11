package src.leetcode.no237;

/**
 * Created by morven on 2018/6/11.
 */
public class Solution1 {

    public static void main(String[] args) {
        ListNode no1 = new ListNode(1);

        ListNode no2 = new ListNode(3);

        ListNode no3 = new ListNode(4);

        no1.next = no2;
        no2.next = no3;
        deleteNode(no1);
        System.out.printf(no1.toString());
    }

    public static void deleteNode(ListNode node) {
        ListNode prev = null;
        while (node.next != null){

        }
    }
}
