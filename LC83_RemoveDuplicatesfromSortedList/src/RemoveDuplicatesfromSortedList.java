
public class RemoveDuplicatesfromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy = new ListNode(0); 
        dummy.next=head;  //use dummy.next = head is a more generic way.
        ListNode l1=dummy.next; //use dummy.next here
        
        while(l1.next!=null){
            if(l1.val==l1.next.val){
                l1.next=l1.next.next;
            }else{
                l1=l1.next;
            }
        }
        return dummy.next; 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
