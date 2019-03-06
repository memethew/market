package market;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;

public class Library {

	public static HashMap<String, Double> library = new HashMap<>();;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	public static NumberFormat f;
	private Cart cart;
	
	public Library() {
		f  = new DecimalFormat("#00.00");
		addLibrary();
		cart = new Cart();
	}
	
	private void addLibrary() {
		library.put("Bubsy 3D", 29.99);
		library.put("Bad Rats", 17.99);
		library.put("E.T. the Extra-Terrestrial", 4.20);
		library.put("Bubsy: The Woolies Strike Back", 0.69);
		library.put("Mighty No. 9", 3.50);
		library.put("Pixel Hunter", 19.99);
		library.put("Desert Bus", 69.99);
		library.put("Fortnite", 10.00);
		library.put("Bubsy 4D: The Return of Bubsy", 59.99);
		library.put("Nya Nya Nya Girls (=^•w•^=)",  29.99);
	}
	
	public static void printLibrary() {
		for(String game : library.keySet()) {
			System.out.println(" $" + f.format(library.get(game)) + " \t" + game);
		}
	}
}
