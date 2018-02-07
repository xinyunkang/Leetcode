
public class RemoveDuplicatesfromSortedList {

	 public ListNode deleteDuplicates(ListNode head) {
	        if(head==null||head.next==null) return head;
	        ListNode dummy =head; //dummy is head not dummy.next = head.
	        ListNode l1=dummy;
	        while(l1.next!=null){
	            if(l1.val==l1.next.val){
	                l1.next=l1.next.next;
	            }else{
	                l1=l1.next;
	            }
	        }
	        return head; //return head. 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
