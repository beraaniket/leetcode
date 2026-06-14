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
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode revNode = null;
        ListNode curr = slow;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = revNode;
            revNode = curr;
            curr = nextNode;
        }
        ListNode firstHalf = head;
        ListNode secondHalf = revNode;
        int twinSum = 0;
        while(secondHalf != null){
            twinSum = Math.max(firstHalf.val + secondHalf.val , twinSum);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return twinSum;
    }
}