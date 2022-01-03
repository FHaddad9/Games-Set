package Hangman;

import java.util.Scanner;

public class Words {
	private String secretWord;
	private Scanner scan;
	public static int chance;
	private Board board;
	
	public Words(String secretWord) {
		this.secretWord = secretWord;;
		this.scan = new Scanner(System.in);
		this.board = new Board();
		Words.chance = 0;
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
	
	public void guess() {
		
		while(chance != 6) {
			System.out.print("\n\nWhich letter would you like to guess? ");
			String letter = scan.next();
			
			int index = secretWord.indexOf(letter);
			
			if(index >= 0) {
				System.out.println("The letter " + letter + " is contained in the word");
			} else {
				System.out.println("The letter " + letter + " is not contained in the word!");
				chance++;
				System.out.println("\nYou have " + chance + "/6 chances left!");
			}
			
			board.printBoard();
		}
		
		if(chance == 6) {
			System.out.println("\n\nThis person was executed...\n\nYou lost!");
		}
	}
}
