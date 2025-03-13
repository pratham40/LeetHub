class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode x = new ListNode(-1);
        x.next=head;
        ListNode temp=x;
        while(temp!=null){
            while(temp.next!=null && temp.next.val==val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return x.next;
    }
}