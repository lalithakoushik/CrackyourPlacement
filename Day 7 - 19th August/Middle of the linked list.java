class Solution {
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode t=head;
        while(t!=null)
        {
            length++;
            t=t.next;
        }
        int mid=length/2;
        ListNode temp=head;
        int count=0;
        while(count<mid) {
            temp=temp.next;
            count++;
        }
        return temp;
    }
}