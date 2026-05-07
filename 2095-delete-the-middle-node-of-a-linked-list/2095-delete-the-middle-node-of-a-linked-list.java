/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode DummyNode = new ListNode(0,head);
        ListNode SlowP = DummyNode;
        ListNode FastP = head;
        while(FastP != null && FastP.next != null){
            SlowP = SlowP.next;
            FastP = FastP.next.next;
        }
        SlowP.next = SlowP.next.next;
        return DummyNode.next; 
    }
}