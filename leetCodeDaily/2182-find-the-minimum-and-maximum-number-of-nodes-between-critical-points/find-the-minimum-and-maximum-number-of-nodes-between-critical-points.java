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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head;
        if(temp == null || temp.next == null || temp.next.next == null){
            return new int[]{-1, -1};
        }
        ArrayList<Integer> list = new ArrayList<>();
        int pre = temp.val;
        temp = temp.next;
        int idx = 2;
        while(temp.next != null){
            if((pre > temp.val && temp.val < temp.next.val) || 
                (pre < temp.val && temp.val > temp.next.val)){
                list.add(idx);
            }
            pre = temp.val;
            temp = temp.next;
            idx++;
        }
        int n = list.size();
        if(n < 2){
            return new int[]{-1, -1};
        }
        int min = Integer.MAX_VALUE;
        int max = list.get(n - 1) - list.get(0);
        for(int i = 1; i < n; i++){
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        return new int[]{min, max};
    }
}