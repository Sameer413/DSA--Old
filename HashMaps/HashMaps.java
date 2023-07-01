package HashMaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMaps<K , V> {
    private class Node{
        K key;
        V value;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    private int size;
    private LinkedList<Node>[] list;

    public HashMaps(){
        inTheList(4);
        size = 0;
    }
    private void inTheList(int i) {
        list = new LinkedList[i];
        for (int j = 0; j < list.length; j++) {
            list[j] = new LinkedList<>();
        }
    }

    public void put(K key, V value){
        int bi = hashfn(key);
        int di = getIndexWithinlist(key , bi);
        if (di != -1){
            Node node  = list[bi].get(di);
            node.value = value;
        }else {
            Node node = new Node(key, value);
            list[bi].add(node);
            size++;
        }

        double lambda = size * 1.0 / list.length;
        if (lambda > 2.0){
            rehash();
        }
    }
    private void rehash() {
        LinkedList<Node>[] oba = list;
        inTheList(oba.length * 2);
        size = 0;

        for (int i = 0; i < oba.length; i++) {
            for (Node node: oba[i]){
                put(node.key, node.value);
            }
        }
    }

    public void remove(K key){
        int bi = hashfn(key);
        int di = getIndexWithinlist(key , bi);
        if(di != -1){
            Node removed = list[bi].remove(di);
            size--;
        }
        return;
    }


    public V get(K key){
        int bi = hashfn(key);
        int di = getIndexWithinlist(key , bi);
        if(di != -1){
            Node geted = list[bi].get(di);
            return geted.value;
        }
        return null;
    }

    public ArrayList<K> Keyset(){
        ArrayList<K> lists = new ArrayList<>();

        for (int i = 0 ; i < list.length; i++){
            for (Node node: list[i]){
                lists.add(node.key);
            }
        }
        return lists;
    }
    public boolean contains(K key){
        int bi = hashfn(key);
        int di = getIndexWithinlist(key , bi);
        if (di != -1){
            return true;
        }
        return false;
    }
    private int getIndexWithinlist(K key, int bi) {
        int di = 0;
        for (Node node: list[bi]){
            if (node.key.equals(key)){
                return di;
            }
            di++;
        }
        return -1;
    }

    private int hashfn(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % list.length;
    }
    public void display() {
        System.out.println("Display Begins");
        for (int bi = 0; bi < list.length; bi++) {
            System.out.print("Bucket" + bi + " ");
            for (Node node : list[bi]) {
                System.out.print( node.key + "@" + node.value + " ");
            }
            System.out.println(".");
        }
        System.out.println("Display Ends");
    }
}
