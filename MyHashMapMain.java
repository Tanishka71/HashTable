package com.bridgelabz.hashing;

public class MyHashMapMain {

	/*
	 *  @desc: The main method that demonstrates the word frequency counting.
	 *  @params: args - command line arguments (not used in this example)
	 * @return:none
	 */
    public static void main(String[] args) {
        // Sample sentence
        String sentence = "To be or not to be";

        // Split the sentence into individual words
        String[] words = sentence.split(" ");

        // Create a hash map to store word frequencies with an appropriate capacity (e.g., 10)
        MyHashMap<String, Integer> wordFrequencyMap = new MyHashMap<>(10);

        // Iterate through each word in the sentence and insert it into the hash map
        for (String word : words) {
            wordFrequencyMap.insert(word);
        }

        // Print the frequency of each word
        for (String word : words) {
            System.out.println("Frequency of '" + word + "': " + wordFrequencyMap.getFrequency(word));
        }
    }
}
