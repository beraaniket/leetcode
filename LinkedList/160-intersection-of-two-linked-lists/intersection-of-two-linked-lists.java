/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int countA = 0;
        int countB = 0;
        while(tempA != null){
            countA++;
            tempA = tempA.next;
        }
        while(tempB != null){
            countB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(countA > countB){
            int diff = countA - countB;
            for(int i = 1; i <= diff; i++){
                tempA = tempA.next;
            }
            while(tempA != tempB){
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempA;
        }
        else{
            int diff = countB - countA;
            for(int i = 1; i <= diff; i++){
                tempB = tempB.next;
            }
            while(tempA != tempB){
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempA;
        }
    }
}