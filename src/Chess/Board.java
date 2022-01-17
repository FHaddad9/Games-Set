package Chess;

public class Board {
	boolean whiteInvalid = false;
	boolean whiteValid = true;
	boolean blackInvalid = false;
	boolean blackValid = true;
	boolean[][] board = new boolean[8][8];
	
	public void initialiseBoard() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(i == 0 || i == 1) {
					board[i][j] = whiteInvalid;
				} else {
					board[i][j] = whiteValid;
				}
				
				if(i == 7 || i == 8) {
					board[i][j] = blackInvalid;
				} else {
					board[i][j] = blackValid;
				}
			}
		}
	}
		
	public void printBoard(){
		int squareNum = 8;
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(j == 7) {
					System.out.print("|   |  " + (squareNum--));
				} else if(board[i][j] == whiteInvalid) {
					System.out.print("| P ");
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
