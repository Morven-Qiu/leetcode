package src.leetcode.no206;


/**
 * @author fhqiu
 * @since 2020-09-07 14:30
 */
public class Solution1 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4))));

        System.out.println(node1);
        System.out.println(reverseList(node1));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode temp = null;
        while (head != null) {
            temp = new ListNode(head.val,temp);
            head = head.next;
        }
        return temp;
    }



}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        ListNode a = this;
        while (a!=null){
            s.append(a.val).append(",");
            a = a.next;
        }

        return s.toString();
    }
}
