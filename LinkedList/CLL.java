package LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void insertIndex(int val, int index){
//        if (index == size){
//            insert(val);
//            return;
//        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node nodes = new Node(val, node.next);
        nodes.next = node.next;
        node.next = nodes;
        size++;
    }

    public void delete(int val){
        Node node = head;
        if (node == null){
             return;
        }
        if (node.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.value == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    public void display(){
        Node node = head;
        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        }while (node != head);
        System.out.println("Start");
    }

    private class Node{
        int value;
        Node next;
        public Node(int val){
            this.value = val;
        }
        public Node(int val, Node nex){
            this.value = val;
            this.next = nex;
        }
    }
}