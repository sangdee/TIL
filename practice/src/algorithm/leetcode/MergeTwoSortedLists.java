package algorithm.leetcode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = list1, q = list2, curr = dummyHead;

        while (p != null && q != null) {
            if (p.val < q.val) {
                curr.next = new ListNode(p.val);
                p = p.next;
            } else {
                curr.next = new ListNode(q.val);
                q = q.next;
            }
            curr = curr.next;
        }

        if (p != null) {
            curr.next = p;
        }
        if (q != null) {
            curr.next = q;
        }

        return dummyHead.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

