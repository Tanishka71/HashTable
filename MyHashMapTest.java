package com.bridgelabz.hashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyHashMapTest {
     
	MyHashMap<String, Integer> wordFrequencyMap = new MyHashMap<>(10);
	@BeforeEach
	void setup() {
        wordFrequencyMap.insert("Cat");
        wordFrequencyMap.insert("Cat");
	}
	
	@Test
	void testFindingFrequencyOfWords() {
		int frequency=wordFrequencyMap.getFrequency("Cat");
		assertEquals(2,frequency,
				"Gives frequency of words");
				
	}
	
	@Test
	void testRemovalOfWords() {
        wordFrequencyMap.remove("Cat");
        assertEquals(0, wordFrequencyMap.getFrequency("Cat"));
				
	}

}
