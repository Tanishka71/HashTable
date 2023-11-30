package com.bridgelabz.hashing;

public class MyHashMapMain {

	/*
	 *  @desc: The main method that demonstrates the word frequency counting.
	 *  @params: args - command line arguments (not used in this example)
	 * @return:none
	 */
    public static void main(String[] args) {
        // Sample sentence
    	String paragraph = "Paranoids are not paranoid because they are paranoid but " +
                "because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = paragraph.split("\\s+"); // Split by whitespace to get individual words

        MyHashMap wordFrequencyMap = new MyHashMap(10); // Choose an appropriate capacity

        for (String word : words) {
            // Convert each word to lowercase to treat them case-insensitively
            word = word.toLowerCase();
            wordFrequencyMap.insert(word);
        }

        // Print the frequency of each word
        for (String word : words) {
        	word=word.toLowerCase()
;            System.out.println("Frequency of '" + word + "': " + wordFrequencyMap.getFrequency(word));
        }
    }
}
