package org.generation.italy;

public class Snack7 {

	/*
		Dato il seguente array:

		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		- creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine
		- creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine inverso
		- trovare e stampare la parola piu' lunga e la sua lunghezza
		- trovare e stampare la parola piu' corta e la sua lunghezza
	 */
	
	public static void main(String[] args) {

		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		String sortedString = "";
		String reversedString = "";
		String longestWord = "";
		String shortestWord = "";
		
		for (int i = 0; i < words.length; i++) {
			
			sortedString += words[i] + " ";
		}
		
		for (int i = words.length -1; i >= 0; i--) {
			
			if(longestWord == "") {
				longestWord = words[i];
			} else if(words[i].length() > longestWord.length()) {
				longestWord = words[i];
			}
			
			if(shortestWord == "") {
				shortestWord = words[i];
			} else if(words[i].length() < shortestWord.length()) {
				shortestWord = words[i];
			}
			
			reversedString += words[i] + " ";
		}
		
		System.out.println("Sorted string: " + sortedString);
		System.out.println("Reversed string: " + reversedString);		
		System.out.println("Longest word: " + longestWord);
		System.out.println("Shortest word: " + shortestWord);
	}

}
