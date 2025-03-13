class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode list:lists){
            ListNode curr=list;
            while(curr!=null){
                pq.add(curr.val);
                curr=curr.next;
            }
        }
        ListNode head = new ListNode(-1);
        ListNode temp=head;
        while(!pq.isEmpty()){
            temp.next=new ListNode(pq.poll());
            temp=temp.next;
        }
        return head.next;
    }
}