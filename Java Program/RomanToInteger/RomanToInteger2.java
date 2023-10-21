package RomanToInteger;

import java.util.Scanner;

public class RomanToInteger2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine();
	        scanner.close();

	        int result = romanToInteger(romanNumeral);
	        if (result == -1) {
	            System.out.println("Invalid Roman numeral entered.");
	        } else {
	            System.out.println("The integer equivalent is: " + result);
	        }
	    }

	    public static int romanToInteger(String s) {
	        int result = 0;
	        int prevValue = 0;

	        for (int i = s.length() - 1; i >= 0; i--) {
	            char currentChar = s.charAt(i);
	            int currentValue = 0;

	            switch (currentChar) {
	                case 'I':
	                    currentValue = 1;
	                    break;
	                case 'V':
	                    currentValue = 5;
	                    break;
	                case 'X':
	                    currentValue = 10;
	                    break;
	                case 'L':
	                    currentValue = 50;
	                    break;
	                case 'C':
	                    currentValue = 100;
	                    break;
	                case 'D':
	                    currentValue = 500;
	                    break;
	                case 'M':
	                    currentValue = 1000;
	                    break;
	                default:
	                    return -1;
	            }

	            if (currentValue < prevValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }

	            prevValue = currentValue;
	        }

	        if (result != 0) {
	            return result;
	        } else {
	            return -1; 
	        }
	    }

}
