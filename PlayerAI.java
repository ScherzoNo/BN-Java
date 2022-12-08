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

import java.util.Random;

public class PlayerAI extends Player implements PlayerAction {
	
	private String genCoord() {
		Random rand = new Random();
		String coord = "";
		char o;
		char y = (char) (rand.nextInt(10) + 65);
		int x = rand.nextInt(10);
		
		if (rand.nextInt(2) == 0) {
			o = 'O';
		} else {
			o = 'V';
		}
		coord = coord + y + x + o;
		return coord;
	}
	
	private String genCoordNoOrientation() {
		Random rand = new Random();
		String coord = "";
		char y = (char) (rand.nextInt(10) + 65);
		int x = rand.nextInt(10);
		coord = coord + y + x;
		return coord;
	}
	
	@Override
	public void arrangeWatercrafts() {
		boolean check = false;
		String coord;
		while (check == false) {
			coord = this.genCoord();
			if (this.Check(coord, 5)) {
				continue;
			}
			check = true;
			this.modify(coord.charAt(0), Character.getNumericValue(coord.charAt(1)), 5, coord.charAt(2));
		}
		check = false;
		
		while (check == false) {
			coord = this.genCoord();
			if (this.Check(coord, 4)) {
				continue;
			}
			check = true;
			this.modify(coord.charAt(0), Character.getNumericValue(coord.charAt(1)), 4, coord.charAt(2));
		}
		check = false;
		
		for (int i = 0; i < 5; i++) {
			while (check == false) {
				coord = this.genCoord();
				if (this.Check(coord, 3)) {
					continue;
				}
				check = true;
				this.modify(coord.charAt(0), Character.getNumericValue(coord.charAt(1)), 3, coord.charAt(2));
			}
			check = false;
		}
		for (int i = 0; i < 3; i++) {
			while (check == false) {
				coord = this.genCoord();
				if (this.Check(coord, 2)) {
					continue;
				}
				check = true;
				this.modify(coord.charAt(0), Character.getNumericValue(coord.charAt(1)), 2, coord.charAt(2));
			}
			check = false;
		}
	}

	@Override
	public String shoot() {
		String coord = "";
		boolean check = false;
		while (check == false) {
			coord = this.genCoordNoOrientation();
			if (this.shootCheck(coord)) {
				continue;
			}
			check = true;
		}
		return coord;
	}

}