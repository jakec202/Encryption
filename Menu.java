package com.encryptionProject;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean menuValidation = false;

		System.out.println("Welcome to the Encryptor!");

		menuOptions(sc);

	} // Main

	public static void menuOptions(Scanner sc) {
		boolean menuValidation;
		do {
			menuValidation = false;
			System.out.println("Please make a menu selection for the Encryptor\n" + "1. Jumbler Encryption\n"
					+ "2. Switcher Encryption\n" + "3. Caesar Cipher Encryption\n" + "4. Decryption\n" + "5. Exit\n");
			String menuSelection = sc.nextLine();
			if (menuSelection.equals("1")) {
				jumbler.userEntry();

				// add the encryptionClass.jumblerMethod

			} else if (menuSelection.equals("2")) {
				System.out.println("You have entered the Switcher!");
				Switcher.switchItUp();
				// break;
				// add the encrytpionClass.switcherMethod

			} else if (menuSelection.equals("3")) {
				System.out.println(
						"You have chosen to encrypt your message with Caesar's cipher.\n");
				Caesar.caesarEncryption();;

			} else if (menuSelection.equals("4")) {
				decryptorMenuOptions(sc);

			} else if (menuSelection.equals("5")) {
				System.out.println("Thank you for using the Encryptor!");
				System.exit(0);

			} else
				System.out.println("Please make a valid menu selection 1, 2, 3, 4 or 5");
			menuValidation = true;

		} while (menuValidation);
	}// menuOptions method

	public static void decryptorMenuOptions(Scanner sc) {
		boolean menuValidation;
		do {
			menuValidation = false;
			System.out.println("Please choose a decryption method you would like to use\n" + "1. Jumbler Decryption\n"
					+ "2. Switcher Decryption\n" + "3. Caesar Cipher Decryption\n" + "4. Return to the Main Menu\n" + "5. Exit\n");
			String menu2Selection = sc.nextLine();
			if (menu2Selection.equals("1")) {
				System.out.println("Welcome to the de-Jumblizer!");
				jumbler.jumbleDecryption();
				// add jumbler decryptor
			} else if (menu2Selection.equals("2")) {
				// System.out.println("Please provide a Switcher encrypted
				// message");
				Switcher.switcherDecrypt();
				// add switcher decryptor
			}else if (menu2Selection.equals("3")){
				System.out.println("Decrypt your message Caesar style");
				Caesar.ceaserDecryption();
			} else if (menu2Selection.equals("4")) {
				System.out.println("You are returning to the Main Menu!");
				menuOptions(sc);
			} else if (menu2Selection.equals("5")) {
				System.out.println("Thank you for using the Encryption App!");
				System.exit(0);

			} else
				System.out.println("Please make a valid menu selection 1, 2,3 or 4");
			menuValidation = true;

		} while (menuValidation);
	} // decryptorMenuOptions method

} // class
