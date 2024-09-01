class Solution {
    Node compute(Node head) {
        return removeNodesWithGreaterValueOnRight(head);
    }
    Node removeNodesWithGreaterValueOnRight(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        node.next = removeNodesWithGreaterValueOnRight(node.next);

        if (node.next != null && node.data < node.next.data) {
            return node.next;
        }

        return node;
    }
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}