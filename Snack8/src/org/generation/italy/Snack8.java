package org.generation.italy;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {

	/*
		Creare un array di 10 elementi interi random compresi tra -50 e +50 (utilizzare l'oggetto random con seed 128 new Random(128))
		
		- trovare il valore assoluto piu' grande e stampare il valore corrispondente
		- trovare il valore assoluto piu' piccolo e stampare il valore corrispondente
		- calcolare la sommatoria dei valori multipli di 5
	 */
	
	public static void main(String[] args) {
		Random rnd = new Random(128);
		
		int[] arr = new int[10];
		
		for (int x = 0; x < 10; x++) {
			int rndValue = rnd.nextInt(100) - 50;
			arr[x] = rndValue;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int absMaxValue = Integer.MIN_VALUE;
		int absMax = Integer.MIN_VALUE;
		
		for (int x = 0; x < arr.length; x++) {
			
			int value = arr[x];
			int absValue = Math.abs(value);
			
			if (absValue > absMax) {
				
				absMax = absValue;
				absMaxValue = value;
			}
		}
		System.out.println("Valore più grande: " + absMaxValue);
		
		// ----------------------------------------------------
		
		int absMinValue = Integer.MAX_VALUE;
		int absMin = Integer.MAX_VALUE;
		for (int x = 0; x < arr.length; x++) {
			
			int value = arr[x];
			int absValue = Math.abs(value);
			
			if (absValue < absMin) {
				absMin = absValue;
				absMinValue = value;
			}
		}
		System.out.println("Valore più piccolo: " + absMinValue);
		
		// -----------------------------------------------------
		
		int sum5 = 0;
		for (int x=0;x<arr.length;x++) {
			
			int value = arr[x];
			
			if (value % 5 == 0) {
				
				sum5 += value;
			}
		}
		System.out.println("Sommatoria dei valori multipli di 5: " + sum5);
	}

}
