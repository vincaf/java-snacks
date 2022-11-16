package org.generation.italy;

public class Snack3 {

	/*
	 * Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
	 */
	
	public static void main(String[] args) {

		int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int sum = 0;
		
		for (int x = 0; x < numbers.length; x++) {
        	if(x % 2 == 1) {
        		sum += numbers[x];
        		System.out.println(numbers[x]);
        	}
        }
		
		System.out.println("La somma dei numeri dispari è: " + sum);
	}

}
