package Easy;

class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {

		ListNode head2 = head;

		ListNode prev = new ListNode(0);

		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		prev = slow;
		slow = slow.next;
		prev.next = null;
		while (slow != null) {
			ListNode n = slow.next;
			slow.next = prev;
			prev = slow;
			slow = n;
		}

		while (prev != null && head2 != null) {
			if (head2.val != prev.val) {
				return false;
			}
			prev = prev.next;
			head2 = head2.next;

		}
		return true;

	}
}
