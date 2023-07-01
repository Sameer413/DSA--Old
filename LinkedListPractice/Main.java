package LinkedListPractice;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        LL <Integer> list1 = new LL<>();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.deleteFirst();
        list.display();

        list1.insertFirst(1);
        list1.insertFirst(2);
        list1.insertFirst(3);
        list1.insertFirst(4);
        list1.insertFirst(5);
        list1.display();

        DLL <Integer> listt = new DLL<>();
        listt.insertFirst(1);
        listt.insertFirst(1);
        listt.insertFirst(1);
        listt.insertFirst(1);
        listt.insertFirst(1);
        listt.display();
    }
}
