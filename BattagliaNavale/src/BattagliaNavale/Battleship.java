package BattagliaNavale;

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
			coord = player1.shoot(); //spara
			x=Character.getNumericValue(coord.charAt(1));
			y=coord.charAt(0)-65;
			 System.out.println(coord);
			if(player2.hitRegistration(x,y)) player1.updateHitBoard(x, y, 'X'); //verifica se ha colpito qualcosa e in caso modifica con una X la hitBoard
			else player1.updateHitBoard(x, y, '0');
			player1.showBoards();//mostro le Boards
			if(player1.checkWin()) {
				System.out.println("Il Giocatore ha vinto");
				win = true;
				continue;
			}
			//cambia valori nella hitBoard con 0 se non ha colpito
			System.out.println(player2.shoot()); //spara
			if(player1.hitRegistration(x,y)) player2.updateHitBoard(x, y, 'X');
			else player2.updateHitBoard(x, y, '0');
			if(player2.checkWin()) {
				System.out.println("Il Computer ha vinto");
				win = true;
				continue;
			}
			//verifica se ha colpito qualcosa
			//cambia valori nella hitBoard
		}
	}
}
