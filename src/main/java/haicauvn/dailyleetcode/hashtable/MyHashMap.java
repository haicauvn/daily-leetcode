package haicauvn.dailyleetcode.hashtable;

import java.util.ArrayList;

public class MyHashMap {
    private class Data {
        private int key;
        private int value;

        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Data) {
                return (key == ((Data) obj).key);
            }
            return false;
        }
    }

    private final int size = 1000;
    private ArrayList<Data>[] myBuckets;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        myBuckets = new ArrayList[size];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key) {
        return key % size;
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data temp = new Data(key, value);
        int keyIndex = bucket.indexOf(temp);
        if (keyIndex < 0) {
            bucket.add(temp);
        } else {
            bucket.set(keyIndex, temp);
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map
     * contains no mapping for the key
     */
    public int get(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data temp = new Data(key, 0);
        int keyIndex = bucket.indexOf(temp);
        if (keyIndex >= 0) {
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping
     * for the key
     */
    public void remove(int key) {
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data temp = new Data(key, 0);
        int keyIndex = bucket.indexOf(temp);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put(1, 1);
        map.put(1, 3);
        map.put(2, 5);
        map.put(1004, 10);
        map.remove(1004);
        System.out.println(map.get(1004));
    }
}
