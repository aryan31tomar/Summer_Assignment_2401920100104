class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode h1=list1;
        ListNode h2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode ans =dummy;
        while(h1!=null&&h2!=null){
            if(h1.val<=h2.val){
                ans.next=h1;
                ans=h1;
                h1=h1.next;
            }
            else{
                ans.next=h2;
                ans=h2;
                h2=h2.next;
            }
        }
        while(h1!=null){
                ans.next=h1;
                ans=h1;
                h1=h1.next;
            }
         while(h2!=null){
            ans.next=h2;
            ans=h2;
            h2=h2.next;
            }
        return dummy.next;   
     }
}
