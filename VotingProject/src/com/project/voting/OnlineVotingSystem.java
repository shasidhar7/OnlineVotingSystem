package com.project.voting;

import java.util.Scanner;

public class OnlineVotingSystem {
	
	public void Election() {
		Scanner sc = new Scanner(System.in);
		
		//get voter name
		System.out.println("Enter Your Name: ");
		String voter = sc.nextLine();
		
		//get the user Age
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		//initialize variables to keep track vote count
		int AndhraPartyVotes = 0;
		int PrajaPartyVotes = 0;
		
		//check the eligibility
		if(age >= 18) {
			
			//list of parties to vote
			System.out.println("Please Select the party which you want to vote for: ");
			System.out.println("1.Andhra Party");
			System.out.println("2.Praja Party");
			
			//get the voter's selection
			int vote = sc.nextInt();
			
			if(vote == 1) {
				AndhraPartyVotes++;
				System.out.println("Thank you for voting, " + voter + "!");
			} else if(vote == 2){
				PrajaPartyVotes++;
				System.out.println("Thank you for voting, " + voter + "!");
			} else {
				//Display invalid choice message to the voter
				System.out.println("Invalid Choice, choose a given party " + voter + "!");
			}
			
		} else {
			//message to the voter if they are not eligible
			System.out.println("I'm sorry, you are not eligible to vote");
		}
		
		System.out.println("Andhra Party: " + AndhraPartyVotes + " votes");
		System.out.println("Praja Party: " + PrajaPartyVotes + " votes");
	
		sc.close();
	}	
	public static void main(String[] args) {
		OnlineVotingSystem v= new OnlineVotingSystem();
		v.Election();
	}

}
