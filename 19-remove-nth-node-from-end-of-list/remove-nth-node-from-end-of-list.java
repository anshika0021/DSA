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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = new ListNode(0);
        ListNode slow = prev;
        ListNode fast = prev;
        prev.next = head;
        for(int i=0;i<=n;i++){
            slow = slow .next;
        }
        while(slow != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = fast.next.next;
        return prev.next;
    }
}