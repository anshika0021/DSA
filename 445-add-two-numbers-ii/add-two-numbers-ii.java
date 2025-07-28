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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer>stack1 = new Stack<>();
        Stack<Integer>stack2 = new Stack<>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode result = null;
        int carry = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty() || carry != 0){
            int num1 =0;
            int num2 = 0;
            if(!stack1.isEmpty()){
                num1 = stack1.pop();
            }
            if(!stack2.isEmpty()){
                num2 = stack2.pop();
            }
            int sum = num1+num2+carry;
            carry = sum/10;
            ListNode newnode = new ListNode(sum%10);
            newnode.next = result;
            result = newnode;
        }
        return result;
    }
}