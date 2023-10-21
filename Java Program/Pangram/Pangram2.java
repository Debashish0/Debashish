package Pangram;

import java.util.Scanner;

public class Pangram2 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();
	        scanner.close();

	        boolean isPangram = checkPangram(sentence);
	        if (isPangram) {
	            System.out.println("The sentence is a pangram.");
	        } else {
	            System.out.println("The sentence is not a pangram.");
	        }
	    }

	    public static boolean checkPangram(String sentence) {
	        boolean[] letters = new boolean[26];
	        sentence = sentence.toLowerCase();

	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                letters[ch - 'a'] = true;
	            }
	        }

	        for (boolean letter : letters) {
	            if (!letter) {
	                return false; 
	            }
	        }

	        return true;
	    }
}
