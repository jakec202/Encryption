package com.encryptionProject;

import java.util.Scanner;

public class Caesar {
	
	public static void caesarEncryption() {
		System.out.println("Welcome to the Caesar Shifter!");
		System.out.println("This is an ancient and simple system that is \n"
				+ "quite efficient at passing hidden messages. The Caesar Shifter relies \n"
				+ "on a 'magic number' that is known only to the message writer and readers.");
		System.out.println();
		System.out.println("Enter the sentence that you would like to encrypt:");
		Scanner sc7 = new Scanner(System.in);
		String nonCodedCaesarSentence = sc7.nextLine();
		System.out.print("How many times would you like Caesar to shift your message?");
		System.out.println("Enter a whole number between 1 and 25:");
		Scanner sc8 = new Scanner(System.in);
		int shiftsToCaesar = sc8.nextInt();
		System.out.println("The 'magic number' to accompany this encrypted message is: " + shiftsToCaesar + ".");
		System.out.println("Make sure to give this number to the recipient of this message!");

		char[] caesarCharArray = nonCodedCaesarSentence.toCharArray();

		// Loop over characters.
		for (int i = 0; i < caesarCharArray.length; i++) {

			// Shift letter, moving back or forward 26 places if needed.
			char nonEncryptedLetter = caesarCharArray[i];
			if (nonEncryptedLetter != ' ') {
				nonEncryptedLetter = (char) (nonEncryptedLetter + shiftsToCaesar);
				if (nonEncryptedLetter > 'z') {
					nonEncryptedLetter = (char) (nonEncryptedLetter - 26);
				}
			}
			caesarCharArray[i] = nonEncryptedLetter;

		}
		String caesarEncryted = String.copyValueOf(caesarCharArray);
		System.out.println();
		System.out.println("Here is your encrypted message:");
		System.out.println(caesarEncryted + "\n");
	} //caesar encryption method
	
	public static void ceaserDecryption() {
		System.out.println("Welcome to the Caesar Decrypter!");
		System.out.println();
		System.out.println("Enter the sentence that you would like to unscrammble:");
		System.out.println();
		Scanner sc9 = new Scanner(System.in);
		String nonDeCodedCaesarSentence = sc9.nextLine();
		System.out.print("What 'magic number' was provided with the message?");
		
		Scanner sc10 = new Scanner(System.in);
		int unShiftsToCaesar = sc10.nextInt();
	
		char[] caesarCharArrayToDeCrypt = nonDeCodedCaesarSentence.toCharArray();

		// Loop over characters.
		for (int i = 0; i < caesarCharArrayToDeCrypt.length; i++) {

		    // Shift letter, moving back or forward 26 places if needed.
		    char stillEncryptedLetter = caesarCharArrayToDeCrypt[i];
		    if (stillEncryptedLetter!=' '){
		    	stillEncryptedLetter = (char) (stillEncryptedLetter - unShiftsToCaesar);
		    if (stillEncryptedLetter < 'a') {
		    	stillEncryptedLetter = (char) (stillEncryptedLetter + 26);
		    }  
		    }
		    caesarCharArrayToDeCrypt[i] = stillEncryptedLetter;
		    
		}
		String caesarDecrypted = String.copyValueOf(caesarCharArrayToDeCrypt);
		System.out.println();
		System.out.println("Your decoded message is: ");
		System.out.println(caesarDecrypted + "\n");
		} //caesar decryption method

} //class
