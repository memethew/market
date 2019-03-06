package market;

import java.util.HashMap;

public class Cart {

	private double total;
	private HashMap<String, Double> games;
	
	 
	public Cart() {
		games = Library.library;
	}
	
	public void addToCart(String game) {
		if (games.containsKey(game)) {
			System.out.println("You added " + game + " to your cart.");
			total += games.get(game);
		}
		System.out.println("Your total is currently $" + Library.f.format(total));
	}
	  
	public void coupon(String couponName) {
		
	}
}
