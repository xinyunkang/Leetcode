
public class LinkedListCycle {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;

		ListNode walker= head;
		ListNode runner= head;

		while (runner.next != null && runner.next.next != null) { // The first is RUNNER.next!=null, NOT WALKER.next.
			walker = walker.next;
			runner = runner.next.next; // NOT head.next/head.next.next
			if (walker == runner)
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListCycle llc = new LinkedListCycle();
		ListNode list1 = llc.new ListNode(1);
		list1.next = llc.new ListNode(2);
		list1.next.next = list1;
		System.out.println(llc.hasCycle(list1));

	}

}
