package haicauvn.dailyleetcode.hashtable;

import java.util.ArrayList;

public class MyHashSet {
    private final int size = 1000;
    private ArrayList<Integer>[] myBuckets;

    @SuppressWarnings("unchecked")
    public MyHashSet() {
        myBuckets = new ArrayList[size];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public void add(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex < 0) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(1);
        System.out.println(hashSet.contains(1));
        hashSet.remove(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(hashSet.contains(1));
        System.out.println(hashSet.contains(2));
    }

}
