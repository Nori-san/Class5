package Exam;

import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Write a Java program that requires the user to enter a single character from the 
//		alphabet. Print Vowel or Consonant, depending on user input. If the user input is 
//		not a letter (between a and z or A and Z), or is a string of length > 1, print an error 
//		message.
//		Test Data
//		Input an alphabet: p
//		Input letter is Consonant 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please Enter a letter (A-Z): ");
		String character = input.next();
		char singleChar = 0;
		
		//to determine weather user input is 1 character string
		if (character.length() != 1) {
			System.out.print("Please Re-Enter a single letter (A-Z)");
			System.exit(0);
		} else {
			singleChar = character.charAt(0);
		}
		
		//to determine weather its a vowel or consonant lower case and upper case
		if (singleChar == 'a' || singleChar == 'e' || singleChar == 'i' || singleChar == 'o' || singleChar == 'u') {
			System.out.print(character + " is a vowel");
		} else if (singleChar == 'A' || singleChar == 'E' || singleChar == 'I' || singleChar == 'O' || singleChar == 'U') {
			System.out.print(character + " is a vowel");
		} else {
			System.out.print(character + " is a consonant");
		}
		
		input.close();
		
	}

}
