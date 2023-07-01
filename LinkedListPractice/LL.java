package LinkedListPractice;

public class LL<V>{

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(V val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(V val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);

        tail.next = node;
        tail = node;
        size++;
    }

    public void insertIndex(V val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public V deleteFirst(){
        if (head == null){
            return null;
        }
        V val = head.value;
        head = head.next;
        size--;
        return val;
    }
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        V value;
        Node next;

        public Node(V value) {
            this.value = value;
        }

        public Node(V value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
