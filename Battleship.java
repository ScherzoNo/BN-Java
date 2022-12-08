/*
 * Ene Alexandru, Frau Antonio
 * 
 * Data, nome file?
 * 
 * JavaSE-17
 *
 * ©
 * 
 * Descrizione programma 
 */

package BattagliaNavale;

import java.awt.Color;

public class Battleship {
	Player player1 = new Player();
	PlayerAI player2 = new PlayerAI();
	
	public void arrange() {
		player2.arrangeWatercrafts();
		player1.arrangeWatercrafts();	
	}
	
	public void game() {
		boolean win = false;
		String coord;
		int x;
		int y;
		
		while (win == false) {
			coord = player1.shoot();
			x = Character.getNumericValue(coord.charAt(1));
			y = coord.charAt(0) - 65;
			player1.updateHitLabel(coord);
			if (player2.hitRegistration(x, y)) {
				player1.updateHitBoard(x, y, Color.blue);
			} else { 
				player1.updateHitBoard(x, y, Color.red);
			}
			if (player1.checkWin()) {
				System.out.println("Il Giocatore ha vinto");
				win = true;
				break;
			}
			
			String coordAi = player2.shoot();
			x = Character.getNumericValue(coordAi.charAt(1));
			y = coordAi.charAt(0) - 65;
			System.out.println("Hit avversario " + coordAi);
			player1.updateHitLabel(coordAi);
			if (player1.hitRegistration(x, y)) {
				player2.updateHitBoard(x, y, Color.blue);
			} else {
				player2.updateHitBoard(x, y, Color.red);
			}
			if (player2.checkWin()) {
				System.out.println("Il Computer ha vinto");
				win = true;
				break;
			}
		}
	}
}