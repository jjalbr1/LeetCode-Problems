package Easy;

class ReverseLinkedList {

	public ListNode reverseList(ListNode head) {

		ListNode current = head;
		ListNode prevCurrent = null;

		while (current != null) {

			ListNode next = current.next;
			current.next = prevCurrent;
			prevCurrent = current;
			current = next;
		}

		return prevCurrent;

	}
}
