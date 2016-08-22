package com.encryptionProject;

import java.util.Scanner;

public class Switcher {

	public static void switchItUp() {
		System.out.println("Please enter what you would like to have encrypted!");
		Scanner swscan = new Scanner (System.in);
		String swuserInput = swscan.nextLine();
		String encryptString = swuserInput.replace('a', '!').replace('b', '@').replace('c', '#').replace('d', '$')
				.replace('e', '%').replace('f', '^').replace('g', '&').replace('h', '*').replace('i', '(')
				.replace('j', ')').replace('k', '-').replace('l', '/').replace('m', ':').replace('n', 'a')
				.replace('o', 'b').replace('p', 'c').replace('q', 'd').replace('r', 'e').replace('s', 'f')
				.replace('t', 'g').replace('u', 'h').replace('v', 'i').replace('w', 'j').replace('x', 'k')
				.replace('y', 'l').replace('z', 'm').replace('!', 'n').replace('@', 'o').replace('#', 'p')
				.replace('$', 'q').replace('%', 'r').replace('^', 's').replace('&', 't').replace('*', 'u')
				.replace('(', 'v').replace(')', 'w').replace('-', 'x').replace('/', 'y').replace(':', 'z');
		System.out.println("Here is your Switcher encrypted message:");
		System.out.println(encryptString +"\n");

	} // switchItUp encryption method
	public static void switcherDecrypt(){
		Scanner sdscan = new Scanner (System.in);
		System.out.println("Please provide a Switcher encrypted message");
		String sduserInput = sdscan.nextLine();
	  String decryptString = sduserInput.replace('n', '!')
	.replace('o', '@')
	.replace('p', '#')
	.replace('q', '$')
	.replace('r', '%')
	.replace('s', '^')
	.replace('t', '&')
	.replace('u', '*')
	.replace('v', '(')
	.replace('w', ')')
	.replace('x', '-')
	.replace('y', '/')
	.replace('z', ':')
	.replace('a', 'n')
	.replace('b', 'o')
	.replace('c', 'p')
	.replace('d', 'q')
	.replace('e', 'r')
	.replace('f', 's')
	.replace('g', 't')
	.replace('h', 'u')
	.replace('i', 'v')
	.replace('j', 'w')
	.replace('k', 'x')
	.replace('l', 'y')
	.replace('m', 'z')
	.replace('!', 'a')
	.replace('@', 'b')
	.replace('#', 'c')
	.replace('$', 'd')
	.replace('%', 'e')
	.replace('^', 'f')
	.replace('&', 'g')
	.replace('*', 'h')
	.replace('(', 'i')
	.replace(')', 'j')
	.replace('-', 'k')
	.replace('/', 'l')
	.replace(':', 'm');
	  System.out.println("Here is your decrypted message from the Switcher:");
	System.out.println(decryptString + "\n");
	} //switcher decryptor method
} //class
