package Hangman;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class HangmanTest {
	String word1 = "can this count spaces";
	String word2 = "abcdefg";
	String word3 = "aaaaaa";

	Words words = new Words(word1.toCharArray());

	
	@Test
	public void maskWordTest() {
		assertEquals(words.maskWord(word1), "*** **** ***** ******");
	}
}
