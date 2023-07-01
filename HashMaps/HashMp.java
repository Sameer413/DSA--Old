package HashMaps;

import java.util.LinkedList;

public class HashMp<K, V>{
    private class Node{
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 0;
    private LinkedList<Node>[] buckets;

    public HashMp(){
        inTheBuckets(4);
        size = 0;
    }
    private void inTheBuckets(int size){
        buckets = new LinkedList[size];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void put(K key , V value){
        int bi = hashfn(key);
        int di = getIndexWithinBucket(key, bi);
    }

    private int getIndexWithinBucket(K key, int bi) {
        int di = 0;
        for (Node node: buckets[bi]) {
                if (node.key.equals(key)){
                    return di;
                }
                di++;
        }
        return -1;
    }

    private int hashfn(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % buckets.length;
    }

}
