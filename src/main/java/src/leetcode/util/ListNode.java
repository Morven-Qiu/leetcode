package src.leetcode.util;

public class ListNode {

    private int val;
    private ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
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
