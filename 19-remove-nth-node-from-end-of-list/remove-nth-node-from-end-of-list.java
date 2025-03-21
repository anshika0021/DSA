class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode first = prev;
        ListNode second = prev;

        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

       
        second.next = second.next.next;

        return prev.next;  
    }
}
