package org.generation.italy;

public class Snack5 {

	/*
	 	Dato il seguente array:
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		- trovare il valore minimo
		- trovare il valore massimo
		- calcolare la media
		- calcolare la sommatoria
	 */
	
	public static void main(String[] args) {
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int sum = 0;
		int maxValue = arr[0];
		int minValue = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if(arr[i] > maxValue ) {
				maxValue = arr[i];
			}
			
			if(arr[i] < minValue) {
				minValue = arr[i];
			}
		}
		
		float avgNum = sum / 10f;
		
		System.out.println("Il valore minimo è " + minValue);
		System.out.println("Il valore massimo è " + maxValue);
		System.out.println("Media dei numeri: " + avgNum);
		System.out.println("Somma dei numeri: " + sum);
		
	}

}
