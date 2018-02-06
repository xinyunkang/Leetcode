
public class SwapNodesinPairs {
	 public ListNode swapPairs(ListNode head) {
	        if(head==null||head.next==null) return head;
	        ListNode dummy = new ListNode(0);        
	        dummy.next=head;
	        ListNode l1 = dummy; //should NOT use dummy directly.
	        ListNode cur = head;
	        while(cur!=null&&cur.next!=null){ //&&, NOT ||
	            //l1->1->2->3->4
	            //      cur
	            ListNode nextStart=cur.next.next; //nextStart(3)
	            
	            l1.next=cur.next; //set (2) as new l1.next / cur(1)
	            //    1->2->3->4
	            //   cur
	            //     l1.next
	            cur.next.next=cur; //set (2).next to (1) / cur(1)
	            //    1<->2  3->4
	            //   cur
	            //      l1.next 
	            cur.next=nextStart; //set (1).next to (3)
	            //    2->1->3->4
	            //      cur
	            // l1.next 
	            l1=cur;         //set l1 to (1)
	            //    2->1->3->4
	            //      cur
	            //       l1
	            cur=cur.next;      //set cur to (3)
	            //    2->1->3->4
	            //         cur
	            //       l1 
	        }
	        return dummy.next;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
