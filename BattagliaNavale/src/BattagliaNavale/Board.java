package BattagliaNavale;

public class Board {
	private int boardLenght=10;
	private int boardHeight=10;
	private char[][] playerBoard = new char[boardHeight][boardLenght];
	private char[][] hitBoard = new char[boardHeight][boardLenght];
	public Board() {
		for (int i=0; i<boardHeight; i++) {
			for (int j=0; j<boardLenght; j++) {
				playerBoard [i][j]='-';
				hitBoard [i][j]='-';
			}
		}
	}
	public char[][] getPlayerBoard() {
		return playerBoard;
	}
	public char[][] getHitBoard() {
		return hitBoard;
	}
	
	public void updatePlayerBoard(int x, int y) {
		playerBoard [x][y] = 'W';
	}
	
	public boolean checkSlice(int x, int y, int len, char orientation) {
		if(orientation == 'O') {
			for (int i=x;i<x+len;i++) {
				//System.out.println(playerBoard[y][i]);
				if(playerBoard[y][i]=='W') return true;
			}
		}
		else if(orientation == 'V') {
			for (int i=y; i<y+len; i++) {
				if(playerBoard[i][x]=='W') return true;
			}
		}
		return false;
	}
	public boolean checkHit(int x, int y) {
		if (hitBoard[y][x]!='-') return true;
		return false;
	}
	
	public boolean gotHit(int x, int y) {
		if (playerBoard[y][x]=='W') {
			playerBoard[y][x]='X';
			return true;
		}
		playerBoard[y][x]='0';
		return false;
	}
	
	public void updateHitBoard(int x, int y, char a) {
		hitBoard [y][x] = a;
	}
	
	public void seeBoards() {
		
		for (int i=0; i<boardHeight; i++) {
			for (int j=0; j<boardLenght; j++) {
				System.out.print(playerBoard [i][j]);
			}
			System.out.print("\n");
		}
		System.out.print("\n \n########################### \n \n");
		for (int i=0; i<boardHeight; i++) {
			for (int j=0; j<boardLenght; j++) {
				System.out.print(hitBoard [i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public boolean checkWin() {
		int counter=0;
		for (int i=0; i<boardHeight; i++) {
			for (int j=0; j<boardLenght; j++) {
				if(hitBoard [i][j]=='X') counter++;
			}
		}
		if (counter==30) return true;
		return false;
	}
}
