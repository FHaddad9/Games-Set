package Hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class Words {
	private String secretWord;
	private ArrayList<String> list;
	private ArrayList<Integer> indList;
	private Board board;
	private Scanner scan;
	private String starWord;
	public static int chance;
	
	public Words(String secretWord) {
		this.secretWord = secretWord;
		this.starWord = "";
		this.scan = new Scanner(System.in);
		this.list = new ArrayList<>();
		this.indList = new ArrayList<>();
		this.board = new Board();
		Words.chance = 0;
	}
	
	public void jump() {
		for(int i = 0; i <= 35; i++) {
			System.out.println("");
		}
	}

	public void maskedWord() {
		int length = secretWord.length();
		
		for(int i = 0; i < length; i++) {
			starWord += "*";
		}
				
		System.out.print("The secret word is: " + starWord);
		System.out.println();
	}
	
	public void maskedWord(String ltr, int index) {
		starWord = "";
		
		int length = secretWord.length();
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < indList.size(); j++) {
				if(i == indList.get(j)) {
					starWord += list.get(j);
				} else if(i == (length - length + i)) {
					starWord += "*";
				}
			}
		}
		
		System.out.print("The secret word is: " + starWord + "\n");
	}
	
	public void guess() {
		
		while(chance != 6) {
			System.out.print("\n\nWhich letter would you like to guess? ");
			String letter = scan.next();
			
			int index = secretWord.indexOf(letter);
			
			if(index >= 0) {
				System.out.println("The letter " + letter + " is contained in the word");
				list.add(letter);
				indList.add(index);
				maskedWord(letter, index);
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
