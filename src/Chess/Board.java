package Chess;

public class Board {
	public void printBoard(){
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print("|  ");
			}
		}
	}
}
