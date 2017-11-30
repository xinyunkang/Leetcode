
public class AddTwoNums {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode temp = new ListNode(0); // just assign val 0 at the beginning. will return .next node.
		ListNode result = temp;
		while (l1 != null || l2 != null || carry != 0) {

			ListNode cur = new ListNode(0);

			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
			carry = sum / 10;
			cur.val = sum % 10;
			temp.next = cur;
			temp = cur;
			l1 = (l1 == null) ? l1 : l1.next; // NOT l1=(l1.next==null)?l1:l1.next;
			l2 = (l2 == null) ? l2 : l2.next;
		}

		return result.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
