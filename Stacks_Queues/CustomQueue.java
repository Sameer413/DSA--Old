package Stacks_Queues;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 5;
    private int size = -1;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public void insert(int item){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        data[++size] = item;
    }
    public int remove(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed = data[0];
        for (int i = 1; i <= size; i++) {
            data[i-1] = data[i];
        }
        size--;
        return removed;
    }

    private boolean isEmpty() {
        return size == -1;
    }

    private boolean isFull(){
        return size == data.length - 1;
    }
    public void display(){
        for (int i = 0; i <= size; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }
}
