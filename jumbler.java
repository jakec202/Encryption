package com.encryptionProject;

import java.util.Random;
import java.util.Scanner;

public class jumbler {
	
	static Scanner jumscan = new Scanner(System.in);
	static Scanner pwscan = new Scanner(System.in);
	static String userPassword = null;
	static String jumbUserInput = null;
	static String pwValidation = null;

	public static void userEntry() {
		
		
		
		
		System.out.println("Welcome to the Jumbler!");
		System.out.println("Please enter a recovery passphrase for the jumbler");
		userPassword = pwscan.nextLine();
		
		
		System.out.println("Please enter what you would like to have encrypted by the Jumbler");
		jumbUserInput = jumscan.nextLine().toLowerCase();
		// System.out.println("Please enter what you would like to have
		// encrypted by the Jumbler");
		// Scanner jumscan = new Scanner(System.in);
		// String jumbUserInput = jumscan.nextLine().toLowerCase();

		StringBuilder sb = new StringBuilder(jumbUserInput);
		for (int i = 0; i < 1; i++) {
			jumbleItUp(sb);
			System.out.println("Your encrypted message by the Jumbler is:");
			System.out.println(sb +"\n");

			// jumscan.close();
		} // for
	} // userEntry

	public static void jumbleItUp(StringBuilder sb) {
		Random rand = new Random(); // randomizer
		for (int i = sb.length() - 1; i > 1; i--) {
			int swapWith = rand.nextInt(i); // randomizing the int in the
											// stringbuilding and sets it to new
											// int swapWith?
			char tmp = sb.charAt(swapWith); // find the char that sits in the
											// random index location from int
											// swapWith?
			sb.setCharAt(swapWith, sb.charAt(i));
			sb.setCharAt(i, tmp);
		} // for
	} // jumbleItUp

	public static void jumbleDecryption(){
		
		Scanner pw2 = new Scanner(System.in);
		
		System.out.println("Ready to decrypt your jumbled phrase?");
		System.out.println("Please enter a recovery passphrase for the jumbler");
		pwValidation = pw2.nextLine();
		
		if ((pwValidation.equals(userPassword))){
			System.out.println("Your encrypted message was " + jumbUserInput + "\n");
			
		//	jumbleDecrypt.dejumblizer();
		}else{
			System.out.println("your password was incorrect");
		}
		
		
		
		
		
	} //jumblerDecryption method
	

} //class
