package market;

import java.util.HashMap;
import java.util.Scanner;

public class Cart {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private double total;
	private HashMap<String, Double> games;
	private HashMap<String, Integer> cart;
	private Scanner scanner;


	public Cart() {
		total = 0;
		games = Library.library;
		cart = new HashMap<>();
		scanner = new Scanner(System.in);
		shop();
	}
	
	public void shop() {
		System.out.println("Welcome to Lando's Gaming Shop!");
		System.out.println("This shopping tool will help you buy AWESOME games and provide a nice coupon code.");
		System.out.println("Here are the selections.");
		Library.printLibrary();
		System.out.println("Please enter the FULL titles of the games you would like to purchase!");
		
		while(true) {
			String input = scanner.nextLine();
			if(Library.library.containsKey(input)) {
				System.out.println("You have added " + input + " to your cart!");
				total += Library.library.get(input);
				System.out.println("Your total is: $" + Library.f.format(total));
			}
			if (input.equals("checkout")) {
				checkout();
				break;
			}
		}
	}

	public void addToCart(String game) {
		
		for(String g : games.keySet()) {
			cart.put(g, 0);
		}
		
		if (games.containsKey(game)) {
			System.out.println("You added " + game + " to your cart.");
			total += games.get(game);
			// TODO ADD COUNTER
		}
		System.out.println("Your total is currently $" + Library.f.format(total));
	}

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	
	public void checkout() {
		String code = randomAlphaNumeric(5);
		int discount = (int) (Math.random()*50);
		System.out.println("You can enter coupon code " + code + " to get a " + discount + "% discount!");
		System.out.println("Enter a coupon code: ");
		if (scanner.nextLine().equalsIgnoreCase(code)) {
			total *= (1-discount*.01);
			System.out.println("Coupon code applied! Your new total is $" + Library.f.format(total));
		} else {
			System.out.println("Invalid coupon code! Your final total is $" + Library.f.format(total));
		}
	}
}
