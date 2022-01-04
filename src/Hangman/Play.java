package Hangman;
import java.util.Scanner;

public class Play {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		
		System.out.println("Welcome to Hangman!");	
		
		System.out.print("\nPlease enter your secret word: ");
		String word = scan.next();
		Words words = new Words(word);
		
		words.jump();
		words.maskedWord();
		board.printBoard();
		words.guess();
	}
}
