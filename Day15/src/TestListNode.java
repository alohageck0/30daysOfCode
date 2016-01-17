public class TestListNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7, new ListNode(0, new ListNode(6)));
        System.out.println(l1.nth(3).item);

        l1.next.insertAfter(4);
        System.out.println(l1.nth(3).item);
    }
}
