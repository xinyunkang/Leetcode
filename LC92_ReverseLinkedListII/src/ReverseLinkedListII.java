
public class ReverseLinkedListII {
	  public ListNode reverseBetween(ListNode head, int m, int n) {
	        ListNode dummy= new ListNode(0);
	        dummy.next=head;
	        ListNode pre=dummy;
	        ListNode cur=dummy.next;
	        for(int i=1;i<m;i++){
	            pre=pre.next;
	            cur=cur.next;
	        }
	        for(int i=0;i<n-m;i++){
	            //tcntnpnt
	            ListNode temp=cur.next;
	            cur.next=temp.next;
	            temp.next=pre.next;
	            pre.next=temp;
	        }
	        return dummy.next;
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
