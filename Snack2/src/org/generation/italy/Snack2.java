package org.generation.italy;

import java.util.Random;

public class Snack2 {

	/*
	 * Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, 
	 * e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
	 */
	
	public static void main(String[] args) {
		
		String[] names = {"Vincenzo", "Salvatore", "Alberto", "Nunzio", "Mario", "Claudio", "Armando", "Fabio", "Pasquale"};

        String[] surnames = {"Cafasio", "Bianchi", "Birillo", "Gregario", "Di Girolamo", "Deputato", "Spada", "Lorrizzi", "Esposito", "Maionco"};
        
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
        	int rndNameIndex = rnd.nextInt(names.length);
        	int rndSurnameIndex = rnd.nextInt(surnames.length);
            System.out.println(names[rndNameIndex] + " " + surnames[rndSurnameIndex]);
        }

	}

}
