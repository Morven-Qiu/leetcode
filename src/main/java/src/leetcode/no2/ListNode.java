package src.leetcode.no2;

import java.util.List;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        String a = String.valueOf(val);
        ListNode TEMP = this;
        while (TEMP.next != null) {
            a = a + ',' + TEMP.next.val;
            TEMP = TEMP.next;
        }
        return a;
    }
}
