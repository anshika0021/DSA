class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next= head;
        while(prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            first.next = second.next;
            second.next= first;
            prev.next = second;
            prev = first;
        }
        return dummy.next;
    }
}
