
public class RemoveLinkedListElements {
	 public ListNode removeElements(ListNode head, int val) {
	        if(head==null) return head;      
	        ListNode dummy = new ListNode(0); 
	        dummy.next=head;  //use dummy.next = head is a more generic way.
	        ListNode p=dummy;
	        
	        while(p.next!=null){
	            if(p.next.val==val){
	                p.next=p.next.next;
	            }else{
	                p=p.next;
	            }
	        }
	        return dummy.next; 
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
