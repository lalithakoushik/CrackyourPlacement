class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode(0),cur=temp;
        temp.next=head;
        while(cur.next!=null)
        {
            if(cur.next.val==val)
            {
                cur.next=cur.next.next;
            }
            else
            {
                cur=cur.next;
            }
        }
        return temp.next;
    }
}