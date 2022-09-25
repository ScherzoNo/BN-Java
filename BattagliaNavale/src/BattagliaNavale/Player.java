package BattagliaNavale;

import java.util.*;

public class Player implements PlayerAction{
	protected Board board = new Board();
	//array di mezzi navali

	protected void modify(char height, int x, int len, char o) {
		
		int y=height-65;
		
		if (o=='O') {
			for(int i=x; i<x+len; i++) board.updatePlayerBoard(y,i);
		}
		else {
			for(int i=y; i<y+len; i++) board.updatePlayerBoard(i,x);
		}
	}
	
	protected boolean Check(String coord, int len) {
		if (coord.length()!=3) return true;
		int x=Character.getNumericValue(coord.charAt(1));
		if((coord.charAt(0)<'A')||(coord.charAt(0)>'J')||(x<0)||(x>9)||((coord.charAt(2)!='O')&&(coord.charAt(2)!='V'))) return true;
		if (coord.charAt(2) == 'V') {
			if((coord.charAt(0)<'A')||(coord.charAt(0)+len-1>'J')) return true;
			
		}
		if (coord.charAt(2) == 'O') {
			if((x<0)||(x+len-1>9)) return true;
		}
		if (board.checkSlice(Character.getNumericValue(coord.charAt(1)), coord.charAt(0)-65, len, coord.charAt(2))) return true;
		return false;
	}
	
	protected boolean shootCheck(String coord) {
		if (coord.length()!=2) return true;
		int x=Character.getNumericValue(coord.charAt(1));
		int y= coord.charAt(0)-65;
		if ((y<0)||(y>9)||(x<0)||(x>9))return true;
		if (board.checkHit(x, y)) return true;
		return false;
	}
	
	protected boolean hitRegistration(int x, int y) {
		if(board.gotHit(x, y)) return true;
		return false;
	}
	
	protected void updateHitBoard(int x, int y, char a) {
		board.updateHitBoard(x, y, a);
	}
	
	protected void showBoards() {
		board.seeBoards();
	}
	
	protected boolean checkWin() {
		if(board.checkWin()) return true;
		return false;
	}
	
	
	@Override
	
	public void arrangeWatercrafts() {
		Scanner reader = new Scanner(System.in);
		boolean check = false;
		String coord;
		while (check == false) {
			System.out.println("inserire coordinata portaerei(dimensione: 5) e orientamento tramite 'V',verticale o 'O',orizzontale (ex A7V/A7O)");
			coord = reader.next();
			if(this.Check(coord, 5)) continue;
			check = true;
			this.modify(coord.charAt(0),Character.getNumericValue(coord.charAt(1)),5,coord.charAt(2));
		}
		check = false;
		this.showBoards();
		while (check == false) {
			System.out.println("inserire coordinata corazzata(dimensione: 4) e orientamento tramite 'V',verticale o 'O',orizzontale (ex A7V/A7O)");
			coord = reader.next();
			if(this.Check(coord, 4)) continue;
			check = true;
			this.modify(coord.charAt(0),Character.getNumericValue(coord.charAt(1)),4,coord.charAt(2));
		}
		check = false;
		this.showBoards();
		for (int i=0; i<5; i++) {
			while (check == false) {
				if(i<2) System.out.println("inserire coordinata crociera(dimensione: 3) e orientamento tramite 'V',verticale o 'O',orizzontale (ex A7V/A7O)");
				else System.out.println("inserire coordinata sottomarino(dimensione: 3) e orientamento tramite 'V',verticale o 'O',orizzontale (ex A7V/A7O)");
				coord = reader.next();
				if(this.Check(coord, 3)) continue;
				check = true;
				this.modify(coord.charAt(0),Character.getNumericValue(coord.charAt(1)),3,coord.charAt(2));
			}
			check = false;
			this.showBoards();
		}
		for(int i=0; i<3; i++) {
			while (check == false) {
				System.out.println("inserire coordinata nave d'assalto(dimensione: 2) e orientamento tramite 'V',verticale o 'O',orizzontale (ex A7V/A7O)");
				coord = reader.next();
				if(this.Check(coord, 2)) continue;
				check = true;
				this.modify(coord.charAt(0),Character.getNumericValue(coord.charAt(1)),2,coord.charAt(2));
			}
			check = false;
			this.showBoards();
		}
		reader.close();
	}

	@Override
	public String shoot() {
		Scanner reader2 = new Scanner(System.in);
		String coord="";
		boolean check = false;
		while (check==false) {
			System.out.println("inserire coordinata da colpire (ex B0)");
			coord = reader2.next();
			if (this.shootCheck(coord)) continue;
			check = true;
		}
		reader2.close();
		return coord;
	}
}
