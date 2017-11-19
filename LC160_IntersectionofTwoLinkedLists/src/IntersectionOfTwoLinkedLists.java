
public class IntersectionOfTwoLinkedLists {

	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		int lengthA = getLength(headA);
		int lengthB = getLength(headB);

		while (lengthA > lengthB) {
			headA = headA.next;
			lengthA--;
		}
		while (lengthB > lengthA) {
			headB = headB.next;
			lengthB--;
		}
		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
			if (headA == null || headB == null) {
				return null;
			}
		}
		return headA;
	}
	
	public int getLength(ListNode head) {
		int length = 0;
		while (head.next != null) {
			head = head.next;
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
