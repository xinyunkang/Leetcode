
public class DeleteNodeInLinkedList {
	public void deleteNode(ListNode node) {
		// We can't really delete the node, but we can kinda achieve the same effect by
		// instead removing the next node after copying its data into the node that we
		// were asked to delete.
		node.val=node.next.val;
		node.next=node.next.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
