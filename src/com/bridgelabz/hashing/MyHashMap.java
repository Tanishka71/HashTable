package com.bridgelabz.hashing;
import java.util.LinkedList;
class MyHashMap<K, V> {
    private final int capacity;
    private final LinkedList<MyMapNode<K, V>>[] buckets;
    
	/*
	 * @desc: constructor for MyHashMap class
	 * @params: capacity - the initial capacity of the hash map
	 * @return:none
	 */
    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.buckets = new LinkedList[capacity];

        // Initialize LinkedLists in each bucket
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    
	/*
	 * @desc: private method to calculate the bucket index for a given key
	 * // @params: key - the key for which the bucket index is calculated
	 * // @return: the calculated bucket index
	 */    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode % capacity);
    }
    
	 
	/*
	 * @desc: inserts a key into the hash map or increments the frequency if the key
	 * is already present
	 * @params: key - the key to be inserted
	 * @return:none
	 */
    public void insert(K key) {
        int bucketIndex = getBucketIndex(key);

        // Check if the key is already present in the bucket
        for (MyMapNode<K, V> node : buckets[bucketIndex]) {
            if (node.key.equals(key)) {
                // If key is found, increment the frequency
                node.value = (V) (Integer) ((Integer) node.value + 1);
                return;
            }
        }

        // If key is not found, add a new node with frequency 1
        buckets[bucketIndex].add(new MyMapNode<>(key, (V) (Integer) 1));
    }
     
    
	/*
	 * @desc: retrieves the frequency of a given key in the hash map
	 * @params: key - the key for which the frequency is retrieved
	 * @return: the frequency of the key, or null if the key is not found
	 */
    public V getFrequency(K key) {
        int bucketIndex = getBucketIndex(key);

        // Check if the key is present in the bucket
        for (MyMapNode<K, V> node : buckets[bucketIndex]) {
            if (node.key.equals(key)) {
                return node.value; // Return the frequency if key is found
            }
        }

        return null; // Return null if key is not found
    }
    

	/*
	 * @desc: removes a word from hash map
	 * @params: key - the key for which the frequency is retrieved
	 * @return: none
	 */
    public void remove(	K key) {
        int bucketIndex = getBucketIndex(key);

        // Find and remove the key from the bucket
        buckets[bucketIndex].removeIf(node -> node.key.equals(key));
    }
}
