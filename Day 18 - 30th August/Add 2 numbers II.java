class Solution {
    ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1=reverse(l1);
        ListNode t2=reverse(l2);
        ListNode dummyNode=new ListNode(-1);
        ListNode current=dummyNode;
        int carry=0;
        while(t1!=null || t2!=null){
            int sum=carry;
            if(t1!=null){
                sum=sum+t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum=sum+t2.val;
                t2=t2.next;
            }
            ListNode newNode=new ListNode(sum%10);
            carry=sum/10;

            current.next=newNode;
            current=current.next;
        }
        if(carry!=0){
            ListNode newNode=new  ListNode(carry);
            current.next=newNode;
        }
        return reverse(dummyNode.next);
    }
}