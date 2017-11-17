import java.util.Arrays;

public class MergeTwoSortedLists {

	
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode fakeHead = new ListNode(0);  //created for return the first node.
		ListNode res = fakeHead;  //created for build the list.
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				res.next = l1;
				l1 = l1.next;
			} else {
				res.next = l2;
				l2 = l2.next;

			}
			res = res.next;
		}
		if (l1 != null) {
			res.next = l1;
		} else if (l2 != null) {
			res.next = l2;
		}

		return fakeHead.next; //res has been go through to the end, fakeHead is still at the head.

	}

	public static void main(String[] args) {
				
		MergeTwoSortedLists mtsl = new MergeTwoSortedLists();
		ListNode list1=new ListNode(11);
		ListNode list2=new ListNode(12);
		list1.next=new ListNode(13);
		list2.next= new ListNode(14);
		ListNode result=mtsl.mergeTwoLists(list1,list2);
		
		while(result!=null) {
			System.out.println(result.val);
			result=result.next;
		}
	}

}
