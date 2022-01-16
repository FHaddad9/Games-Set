package Hangman;

import java.util.Scanner;

public class Words {
	private char[] secretWord;
	private char[] starWord;
	private Board board;
	private Scanner scan;
	public static int chance;
	
	public Words(char[] secretWord) {
		this.secretWord = secretWord;
		this.starWord = new char[secretWord.length];
		this.scan = new Scanner(System.in);
		this.board = new Board();
		Words.chance = 0;
	}
	
	public void jump() {
		for(int i = 0; i <= 35; i++) {
			System.out.println("");
		}
	}

	public char[] maskWord(String word) {
		for(int i = 0; i < secretWord.length; i++) {
			if(secretWord[i] == ' ') {
				starWord[i] = ' ';
			} else {
				starWord[i] = '*';
			}
		}
		
		return starWord;
	}
	
	public boolean maskedWord(String ltr) {
		boolean check = false;
		
		char[] letter = ltr.toCharArray();
		
		for(int i = 0; i < secretWord.length; i++) {
			if(secretWord[i] == letter[0]) {
				starWord[i] = letter[0];
				check = true;
			}
		}
		
		System.out.println();
		
		return check;
	}
	
	public boolean win() {
		int check = 0;
		
		for(int i = 0; i < secretWord.length; i++) {
			if(secretWord[i] == starWord[i]) {
				check++;
			}
		}
		
		if(check == secretWord.length) {
			return true;
		}
		
		return false;
	}
	
	public void printStar() {
		System.out.print("\nThe secret word is: ");
		
		for(int i = 0; i < secretWord.length; i++) {
			System.out.print(starWord[i]);
		}
		
		System.out.println();
	}
	
	public void guess() {
		
		while(chance != 6) {
			if(win()) {
				System.out.println("You win!");
				break;
			}
			
			printStar();
			
			System.out.print("\n\nWhich letter would you like to guess? ");
			String letter = scan.next();
			
			if(maskedWord(letter)) {
				System.out.println("The letter " + letter + " is contained in the word");
				maskedWord(letter);
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
