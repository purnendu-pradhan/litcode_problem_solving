package com.purn.string;

public class SentenceReconstruction {

	//Remove extra spaces between words.
	public static void main(String[] args) {

		String input = "elephant dog umbrella ink at";
		
		String result = "00";
		
		String[] words = input.split("\\s");
		
		for(String word : words) {
			
     char ch = word.toLowerCase().charAt(0);
     
     if((ch == 'a' || ch == 'e' ||
             ch == 'i' || ch == 'o' ||
             ch == 'u') && word.length() % 2 == 0) {
    	 
    	 result = word;
    	 break;
    	 
     }
     
		}
		
		System.out.println(result);
	}

}
