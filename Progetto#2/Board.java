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

import java.awt.*;
import javax.swing.*;
import java.awt.Font;

public class Board {
	private final static int boardLenght = 10;
	private final static int boardHeight = 10;
	private JLabel playerBoard[][] = new JLabel[boardHeight][boardLenght];
	private JLabel hitBoard[][] = new JLabel[boardHeight][boardLenght];
	private JLabel lb = new JLabel("Battaglia navale", SwingConstants.CENTER);
	private JLabel lb2 = new JLabel("", SwingConstants.CENTER);
	private JFrame tikitaka = new JFrame("POGGIES");
	private JPanel takamutz = new JPanel();
	private JPanel takamutz2 = new JPanel();
	private JPanel takamutz3 = new JPanel();
	private GridLayout ally = new GridLayout(10, 10, 0, 0);
	private GridLayout enemy = new GridLayout(10, 10, 0, 0);
	
	public Board() {
		takamutz.setLayout(ally);
		takamutz3.setLayout(enemy);
		for (int i = 0; i < boardHeight; i++) {
			for (int j = 0; j < boardLenght; j++) {
				playerBoard[i][j] = new JLabel(" ");
				hitBoard[i][j] = new JLabel(" ");
				playerBoard[i][j].setBackground(Color.white);
				hitBoard[i][j].setBackground(Color.white);
				playerBoard[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
				hitBoard[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
				takamutz.add(playerBoard[i][j]);
				takamutz3.add(hitBoard[i][j]);
			}
		}
	}
	
	public void create() {
		Font font = new Font("Courier", Font.BOLD, 25);
		lb.setFont(font);
		tikitaka.setDefaultCloseOperation(tikitaka.EXIT_ON_CLOSE);
		tikitaka.setResizable(true);
		tikitaka.setSize(800, 350);
		tikitaka.setLocation(600, 300);
		tikitaka.getContentPane().setLayout(new GridLayout(1, 3, 0, 0));
		tikitaka.getContentPane().add(takamutz);
		takamutz2.setLayout(new BorderLayout());
		takamutz2.add(lb, BorderLayout.NORTH);
		takamutz2.add(lb2, BorderLayout.CENTER);
		tikitaka.getContentPane().add(takamutz2);
		tikitaka.getContentPane().add(takamutz3);
		tikitaka.setVisible(true);
	}
	
	public void updateText(String coord) {
		lb2.setText("Hit computer: " + coord);
	}
	
	public JLabel[][] getPlayerBoard() {
		return playerBoard;
	}
	
	public JLabel[][] getHitBoard() {
		return hitBoard;
	}
	
	public void updatePlayerBoard(int x, int y) {
		playerBoard[x][y].setOpaque(true);
		playerBoard[x][y].setBackground(Color.green);
	}
	
	public boolean checkSlice(int x, int y, int len, char orientation) {
		if (orientation == 'O') {
			for (int i = x; i < x + len; i++) {
				if (playerBoard[y][i].getBackground() == Color.green) {
					return true;
				}
			}
		} else if (orientation == 'V') {
			for (int i = y; i < y + len; i++) {
				if (playerBoard[i][x].getBackground() == Color.green) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean checkHit(int x, int y) {
		if (hitBoard[y][x].getBackground() != Color.white) {
			return true;
		}
		return false;
	}
	
	public boolean gotHit(int x, int y) {
		if (playerBoard[y][x].getBackground() == Color.green) {
			playerBoard[y][x].setBackground(Color.blue);
			playerBoard[y][x].setOpaque(true);
			return true;
		}
		playerBoard[y][x].setOpaque(true);
		playerBoard[y][x].setBackground(Color.red);
		return false;
	}
	
	public void updateHitBoard(int x, int y, Color a) {
		hitBoard [y][x].setOpaque(true);
		hitBoard [y][x].setBackground(a);
	}
}