package Stacks_Queues;

public class CustomStacks {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStacks(){
        this(DEFAULT_SIZE);
    }
    public CustomStacks(int size){
        this.data = new int[size];
    }

    public boolean push(int val){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Cannot pop from an Empty Stack");
            return -1;
        }
        return data[ptr--];
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Cannot peek from an Empty Stack");
            return -1;
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
