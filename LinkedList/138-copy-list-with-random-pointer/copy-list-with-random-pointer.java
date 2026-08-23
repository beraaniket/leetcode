/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node copy = new Node(0);
        Node t1 = head;
        Node t = copy;
        while(t1 != null){
            Node n = new Node(t1.val);
            t.next = n;
            t = t.next;
            t1 = t1.next;
        }
        copy = copy.next;
        t1 = head;
        Node t2 = copy;
        t = new Node(1);
        while(t1 != null){
            t.next = t1;
            t1 = t1.next;
            t = t.next;
            t.next = t2;
            t2 = t2.next;
            t = t.next;
        }
        t1 = head;
        t2 = copy;
        while(t1 != null){
            if(t1.random == null){
                t2.random = null;
            }
            else{
                t2.random = t1.random.next;
            }
            t1 = t2.next;
            if(t1 != null) t2 = t1.next;
        }
        t1 = head;
        t2 = copy;
        while(t1 != null){
            t1.next = t2.next;
            t1 = t1.next;
            if(t2.next == null) break;
            t2.next = t1.next;
            t2 = t2.next;
        }
        return copy;
    }
}