package BattagliaNavale;

public class Watercraft {
	private int size;
	private String name;
	private int xStart;
	private int yStart;
	private char orientation;
	public Watercraft(String n,int x, int y, char o) {
		name = n;
		xStart = x;
		yStart = y;
		orientation = o;
		if (n=="Portaerei") size = 5;
		
		else if (n=="Corazzata") size = 4;
		
		else if (n=="Crociera") size = 3;
		
		else if (n=="Sottomarino") size = 3;
		
		else if (n=="NaveAssalto") size = 2;
		
	}
	public int getSize() {
		return size;
	}
}
