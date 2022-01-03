package Hangman;

public class Board {
	
	public Board() {
	}
	
	public void printBoard() {

		int chance = Words.chance;
		
		switch(chance) {
			case 0:
				System.out.println("________\n |    |\n |\n |\n |\n |");
				break;
			case 1:
				System.out.println("________\n |    |\n |    O\n |\n |\n |");
				break;
			case 2:
				System.out.println("________\n |    |\n |    O\n |    |\n |\n |");
				break;
			case 3:
				System.out.println("________\n |    |\n |    O\n |   /|\n |\n |");
				break;
			case 4:
				System.out.println("________\n |    |\n |    O\n |   /|\\\n |\n |");
				break;
			case 5:
				System.out.println("________\n |    |\n |    O\n |   /|\\\n |   / \n |");
				break;
			case 6:
				System.out.println("________\n |    |\n |    O\n |   /|\\\n |   / \\\n |");
				break;
				
		}
	}
	
	
}

