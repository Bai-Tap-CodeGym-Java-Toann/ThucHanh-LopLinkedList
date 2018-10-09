public class Linked {
    private Node head;
    private int numNodes = 1;

    public Linked(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next = null;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = moveToIndex(index - 1);
        if (temp == null) {
            temp = moveToLastNode();
        }
        Node current = temp.next;
        temp.next = new Node(data);
        temp.next.next = current;
        numNodes++;
    }

    public boolean remove(int index) {
        if (moveToIndex(index) == null) return false;
        Node temp = moveToIndex(index - 1);
        Node current = temp.next;
        temp.next = current.next;
        current.next = null;
        numNodes--;
        return true;
    }


    public Object getNode(int index) {
        return moveToIndex(index).getData();
    }

    public void printList() {
        System.out.println("list size: " + numNodes);
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void removeFirst() {
        Node temp = head.next;
        head.next = null;
        head = temp;
        numNodes--;
    }

    private Node moveToIndex(int index) {
        Node cursor = head;
        if (index < numNodes && index >= 0) {
            for (int i = 0; i < index; i++) {
                cursor = cursor.next;
            }
            return cursor;
        }
        return null;
    }

    private Node moveToLastNode() {
        Node cursor = head;
        while (!(cursor.next == null)) {
            cursor = cursor.next;
        }
        return cursor;
    }
}
