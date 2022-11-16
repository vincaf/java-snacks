package org.generation.italy;

public class Snack6 {

	/*
	 	Dati i seguenti array:

		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		- calcolare un array sommatoria dove ogni elemento corrisponde alla somma degli elementi dei due array alla stessa posizione
		- trovare il valore minimo all'interno di entrambi gli array
		- trovare il valore massimo all'interno di entrambi gli array
		- calcolare la media di entrambi gli array (assieme)
		- calcolare la somma di tutti gli elementi di entrambi gli array
	 */
	
	public static void main(String[] args) {
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		int[] sumArr = new int[arr1.length];
		
		int sum = 0;
		int maxValue = arr1[0];
		int minValue = arr1[0];
		
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
			
			if(arr1[i] > maxValue ) {
				maxValue = arr1[i];
			}
			
			if(arr1[i] < minValue) {
				minValue = arr1[i];
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			sum += arr2[i];
			
			if(arr2[i] > maxValue ) {
				maxValue = arr2[i];
			}
			
			if(arr2[i] < minValue) {
				minValue = arr2[i];
			}
		}
		
		System.out.print("Array sommatoria: ");
		
		for (int i = 0; i < sumArr.length; i++) {
			sumArr[i] = arr1[i] + arr2[i];
			System.out.print(sumArr[i] + " ");
		}
		
		float avgNum = sum / 20f;
		
		System.out.println("\n");
		System.out.println("Somma di tutti gli elementi degli array: " + sum);
		System.out.println("Valore minimo all'interno di entrambi gli array: " + minValue);
		System.out.println("Valore massimo all'interno di entrambi gli array: " + maxValue);
		System.out.println("Media di entrambi gli array: " + avgNum);		

	}

}
