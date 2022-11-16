package org.generation.italy;

import java.util.Scanner;

public class Snack1 {

	/*
	 * Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero: ");
		int userNumber = sc.nextInt();
		
		sc.close();
		
		if(userNumber % 2 == 0) {
			System.out.println("Numero pari - " + userNumber);
		} else {
			int oddNumber = userNumber + 1;
			System.out.println("Numero dispari - " + oddNumber);
		}

	}

}
