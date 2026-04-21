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
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        ListNode fast = head;


        while(n > 0 && fast != null){
            fast = fast.next;
            n--;
        }

        while(fast != null){
            cur = cur.next;
            fast = fast.next;
        }
        cur.next = cur.next.next;

        return dummy.next;

    }
}
/*
1     2     3     4    
.           .
      .            .
            .         .

1     2
.        .

*/