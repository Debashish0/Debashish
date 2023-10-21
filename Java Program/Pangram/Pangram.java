package Pangram;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
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
	        Set<Character> alphabetSet = new HashSet<>();
	        sentence = sentence.toLowerCase();

	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);
	            if (Character.isLetter(ch)) {
	                alphabetSet.add(ch);
	            }
	        }

	        return alphabetSet.size() == 26;
	    }
}
