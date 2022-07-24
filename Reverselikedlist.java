class LinkedList {
    static Node head;
    static class Node {
        int a;
        Node next;

        Node(int b) {
            a = b;
            next = null;
        }
    }

    //reverse link list
    Node reverse(Node node) {
        Node previousls = null;
        Node currentls = node;
        Node nextls = null;
        while (currentls != null) {
            nextls = currentls.next;
            currentls.next = previousls;
            previousls = currentls;
            currentls = nextls;
        }
        node = previousls;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.a + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(90);
        list.head.next = new Node(26);
        list.head.next.next = new Node(6);
        list.head.next.next.next = new Node(15);

        System.out.println("Before reversed:");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("After reversed: ");
        list.printList(head);
    }
}
