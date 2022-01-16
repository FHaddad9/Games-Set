package Chess;

public class Board {
	boolean invalid = false;
	boolean valid = true;
	int[][] board;
	
	public void initialiseBoard() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(board[i][j])
			}
		}
	}
	
	public boolean setValid() {
		
	}
	
	public void printBoard(){
		int squareNum = 8;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(j == 7) {
					System.out.print("|   |  " + (squareNum--));
				} else {
					System.out.print("|   ");
				}
			}

			System.out.println();
			
			for(int j = 0; j < 8; j++) {
				System.out.print("----");
			}
			
			System.out.println();
		
			
		}
			System.out.print("  a   b   c   d   e   f   g   h");
	}
}
