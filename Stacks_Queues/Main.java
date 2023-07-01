package Stacks_Queues;

public class Main {
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);
        q.display();
        System.out.println(q.remove());
        q.insert(54);
        q.display();

    }
}
