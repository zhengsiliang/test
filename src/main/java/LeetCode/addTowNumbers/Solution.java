package LeetCode.addTowNumbers;


public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(getNodeVal(l1, l2));
        if (l1.next != null || l2.next != null) {
            result.next = addTwoNumbers(l1.next, l2.next);
        }

        if ((l1.val + l2.val) > 9) {
            result.next = refresh(result.next);
        }
        return result;

    }

    public int getNodeVal(ListNode l1, ListNode l2) {
        return (l1.val + l2.val) % 10;
    }

    public ListNode refresh(ListNode node) {
        if (node == null) {
            node = new ListNode(1);
            return node;
        }
        if ((node.val + 1 > 9)) {
            node.next = refresh(node.next);
        }
        node.val = (node.val + 1) % 10;

        return node;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        Solution solution = new Solution();
        System.out.println(solution.addTwoNumbers(l1, l2));
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + "->" + next;
    }
}