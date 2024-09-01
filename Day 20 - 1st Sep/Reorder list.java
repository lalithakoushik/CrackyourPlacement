class Solution {
    public void reorderList(ListNode head) {
        if(head==null)
        {
            return;
        }
        ListNode left=head;
        ListNode right=head;
        while(right!=null && right.next!=null)
        {
            left=left.next;
            right=right.next.next;
        }
        ListNode prev=null;
        ListNode curr=left;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        ListNode first = head;
        ListNode second = prev;
        while (second.next != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            first = temp1;

            second.next = first;
            second = temp2;
        }
    }
}