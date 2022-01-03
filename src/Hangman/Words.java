package Hangman;

import java.util.Scanner;

public class Words {
	private String secretWord;
	
	public Words(String secretWord) {
		this.secretWord = secretWord;
	}

	public void maskedWord() {
		int length = secretWord.length();
		
		for(int i = 0; i <= 35; i++) {
			System.out.println("");
		}
		
		System.out.print("The secret word is: ");
		
		for(int i = 0; i < length; i++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
}
