package BattagliaNavale;
import java.util.*;
public class BattagliaNavaleTester {
	public static void main(String[] args) {
		//Board a = new Board();
		//a.updatePlayerBoard(0, 2);
		//a.prova();
		
		//Player d = new Player();
		//d.arrangeWatercrafts();
		//char x='A';
		//int b=x;
		//if(x+3>'B')System.out.print(x+10);
		//PlayerAI d = new PlayerAI();
		//d.arrangeWatercrafts();
		Battleship game = new Battleship();
		game.arrange();
		game.game();
		//Scanner reader2 = new Scanner(System.in);
		//String coord;
		//coord = reader2.next();
		//System.out.println(coord);
	}
}
