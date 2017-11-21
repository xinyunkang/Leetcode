
public class Palindrome {

	public boolean isPalindrome(ListNode head) {
		ListNode runner = head;
		ListNode walker = head;
		while (runner != null && runner.next != null) {
			runner = runner.next.next;
			walker = walker.next;
		}
		ListNode secondHalf = getReverse(walker);
		ListNode firstHalf = head;
		while (secondHalf != null) {
			if (secondHalf.val != firstHalf.val) {
				return false;

			}
			secondHalf = secondHalf.next;
			firstHalf = firstHalf.next;
		}
		return true;

	}

	public ListNode getReverse(ListNode head) {
		ListNode current = head;
		ListNode next = null;
		ListNode previous = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
