
public class RemoveNthNodeFromEndofList {
	/*public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next=head;
    int length=0;
    ListNode first=head;
    while(first!=null){
        length++;
        first=first.next;
    }
    length-=n;
    first=dummy;  //Use dummy, NOT head.
    while(length>0){
        length--;
        first=first.next;
    }
    first.next=first.next.next;
    return dummy.next;
}*/

public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next=head;
    ListNode fast=dummy;  //use dummy not head, when need to change the list.
    ListNode slow=dummy;
    for(int i=0;i<=n;i++){  //let fast n steps ahead slow, n+1 loop
        fast=fast.next;
    }
    while(fast!=null){
        fast=fast.next;
        slow=slow.next;
    }
    slow.next=slow.next.next;
    return dummy.next;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
