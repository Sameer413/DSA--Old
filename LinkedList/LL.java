package LinkedList;

public class LL {
    private Node Head;
    private Node Tail;
    private int size;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.Next = Head;
        Head = node;
        if (Tail == null){
            Tail = Head;
        }
        size++;
    }

    public void insertLast(int val){
        if (Tail == null){
            insertFirst(val);
        }

        Node node = new Node(val);
        Tail.Next = node;
        Tail = node;
        size++;
    }

    public void insertIndex(int val, int Index){
        if (Index == 0){
            insertFirst(val);
            return;
        }
        if (Index == size){
            insertLast(val);
            return;
        }
        Node prev = Head;
        for (int i = 1; i < Index; i++) {
            prev = prev.Next;
        }
        Node node = new Node(100, prev.Next);
        prev.Next = node;
        size++;
    }

    public void deleteFirst(){
        Head = Head.Next;
        if (Head == null){
            Tail = null;
        }
        size--;
    }

    public void deleteLast(){
        Node prev = Head;
        while (prev.Next != Tail){
            prev = prev.Next;
        }
        prev.Next = null;
        Tail = prev;
        size--;
    }

    public void deleteIndex(int Index){
        if (Index == 0){
            deleteFirst();
            return;
        }
        if (Index == size){
            deleteLast();
            return;
        }
        Node prev = Head;
        for (int i = 1; i < Index; i++) {
            prev = prev.Next;
        }
        prev.Next = prev.Next.Next;
        size--;
    }

    public int size(){
        return size;
    }
    public void display(){
        Node node = Head;
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.Next;
        }
        System.out.println("End");
    }
    private class Node{
        int data;
        Node Next;

        public Node(int data) {
            this.data = data;
        }

        public Node (int data, Node Next){
            this.data = data;
            this.Next = Next;
        }
    }
}
