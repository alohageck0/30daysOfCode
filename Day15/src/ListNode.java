public class ListNode {
    int item;
    ListNode next;

    public ListNode(int item, ListNode next) {
        this.item = item;
        this.next = next;
    }

    public ListNode(int item) {
        this(item, null);
    }

    public void insertAfter(int item) {
        this.next = new ListNode(item, next);
    }

    public ListNode nth(int position) {
        if (position == 1) {
            return this;
        } else if ((position < 1) || (next == null)) {
            return null;
        } else {
            return next.nth(position - 1);
        }
    }
}
