
public class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next; // step 1: put the next pointer to the current next node. N
			current.next = previous; // step 2: put the current.next pointer to the previous node. CN
			previous = current; // step 3: point the previous node to current node. P
			current = next; // step 4: point the current node to the next node C
			// step 3 and 4 is to shifting the node

		}
		return previous;
	}

	public static void main(String[] args) {

	}

}
