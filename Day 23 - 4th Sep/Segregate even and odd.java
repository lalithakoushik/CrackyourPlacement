
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
public class GfG {

        static Node segregateEvenOdd(Node head) {
        Node evenStart = null;
        Node evenEnd = null;

        Node oddStart = null;
        Node oddEnd = null;
        Node currNode = head;

        while (currNode != null) {
            int val = currNode.data;

               if (val % 2 == 0) {
                if (evenStart == null) {
                    evenStart = currNode;
                    evenEnd = evenStart;
                }
                else {
                    evenEnd.next = currNode;
                    evenEnd = evenEnd.next;
                }
            }
            else {
              
                    if (oddStart == null) {
                    oddStart = currNode;
                    oddEnd = oddStart;
                }
                else {
                    oddEnd.next = currNode;
                    oddEnd = oddEnd.next;
                }
            }
            currNode = currNode.next;
        }
        if (oddStart == null || evenStart == null)
            return evenStart;

        // Add odd list after even list.
        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(10);
        head.next.next.next.next.next.next = new Node(11);

        System.out.print("Original Linked list: ");
        printList(head);

        head = segregateEvenOdd(head);

        System.out.print("Modified Linked list: ");
        printList(head);
    }
}
