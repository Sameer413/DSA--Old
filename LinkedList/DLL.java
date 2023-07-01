package LinkedList;

public class DLL {

    private Node head;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        head = node;
        if (head != null){
            head.prev = node;
        }
        size++;
    }

    public void insertLast(int val){
        Node pre = head;
        for (int i = 0; i < size - 1; i++) {
            pre = pre.next;
        }
        Node node = new Node(val);

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        node.prev = pre;
        pre.next = node;
        size++;
    }

    public void insertIndex(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }

        Node node = new Node(val);
        node.prev = prev;
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
