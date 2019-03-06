package market;

import java.util.HashMap;
import java.util.Scanner;

public class Cart {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private double total;
	private HashMap<String, Double> games;
	private Scanner scanner;


	public Cart() {
		total = 0;
		games = Library.library;
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
				System.out.println("Your total is: " + total);
			}
		}
	}

	public void addToCart(String game) {
		if (games.containsKey(game)) {
			System.out.println("You added " + game + " to your cart.");
			total += games.get(game);
		}
		System.out.println("Your total is currently $" + Library.f.format(total));
	}

	public void coupon() {
		System.out.println(randomAlphaNumeric(10));
	}
	

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
}
