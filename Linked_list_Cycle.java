/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode current=head;
        ListNode dummy=head;
        int i=0;
        
        while(current!=null && current.next!=null)
        {
           current=current.next.next;
           dummy=dummy.next;

           if(current==dummy)
           {
            return true;
           }

        }
        return false;
        


    }
}
