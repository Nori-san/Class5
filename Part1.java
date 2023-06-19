package Exam;

import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//variable for apps and songs cost
		int apps = 3, 
			songs = 7;
			
		System.out.print("How much money do you wish to prepay? ");
		int prepaid = input.nextInt(),
		
		//determining apps and songs can be downloaded with the prepaid amount and remaining funds
		
		//apps
			numApps = prepaid / apps,
			appFunds = prepaid % apps,
		
		//songs
			numSongs = prepaid / songs,
			songFunds = prepaid % songs,
		
		//remaining apps after purchasing number of songs
			remainApps = songFunds / apps,
			remainFunds = songFunds % apps;
		
		//using ternary operator determine weather song or apps are singular or plural with the exception of 0
		String isPluralOrSingle = numApps != 1 && numSongs != 1  && remainApps != 1 ? "(s)" : "" ;
		
		if (prepaid < 0) {
			System.out.println("Please Re-Enter the amount you wish to prepay");
			System.exit(0);
		} else {
		System.out.println("With this amount, you will be able to purchase " + numApps + " app" + isPluralOrSingle + ". You will have " + appFunds + "$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase " + numSongs + " song" + isPluralOrSingle + " and " + remainApps + " app" + isPluralOrSingle + ". You will then have " + remainFunds + 
							"$ left as a credit on your account.");
		System.out.println("Thanks for Shopping at Best Music Store!");
		}
		
		input.close();
	}

}
