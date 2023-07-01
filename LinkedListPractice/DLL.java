package LinkedListPractice;

public class DLL <K> {

    private Node head;
    int size;
    private Node tail;

    public void insertFirst(K vallue){
        Node node = new Node(vallue);
        node.next = head;
        node.prev = null;
        head = node;
        if (head!= null){
            head.prev = node;
        }
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + "-> ");
            node = node.next;
        }
        System.out.println("End");
    }

    class Node{
        K value;
        Node prev;
        Node next;

        public Node(K value) {
            this.value = value;
        }

        public Node(K value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
