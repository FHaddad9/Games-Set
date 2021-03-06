package Hangman;
import java.util.Scanner;

public class Play {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		
		System.out.println("Welcome to Hangman!");	
		
		System.out.print("\nPlease enter your secret word: ");
		String word = scan.nextLine();
		Words words = new Words(word.toCharArray());
		
		words.jump();
		words.maskWord(word);
		board.printBoard();
		words.guess();
	}
}
