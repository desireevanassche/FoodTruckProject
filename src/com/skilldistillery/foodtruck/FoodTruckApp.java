package com.skilldistillery.foodtruck;

import java.util.*;

public class FoodTruckApp {

	static Scanner kb = new Scanner(System.in); // can the canner be static?

	public static void main(String[] args) {

		System.out.println("Welome to the international food truck cook off!");
		System.out.println("You can rate up to 5 food trucks.");

		FoodTruck[] foodTruckArr = new FoodTruck[5];
		boolean quit = false;

		while (quit != true) {
			
			for (int i = 0; i < foodTruckArr.length; i++) {
				foodTruckArr[i] = new FoodTruck();
				System.out.println("Enter the name of the food truck you want to rate: ");
				foodTruckArr[i].setName(kb.nextLine());

				System.out.println("What type of food is served at this food truck ?");
				foodTruckArr[i].setFoodType(kb.nextLine());

				System.out.println("Out of 5 stars, how would you rate this food truck?");
				foodTruckArr[i].setRating(kb.nextDouble());
				

				System.out.println("Add more input or quit? \ntype \"quit\" to go to main menu or..");
				String userQuit = kb.nextLine();

			if  (userQuit.equals("quit")) {
				quit = true;			
				//menu();
					

			}
		}
	}
}
}

//menu();
//	public static void menu() {
//		System.out.println("Please enter a number below to choose from the following menu: ");
//		System.out.println("1. List all food trucks.");
//		System.out.println("2. See Average rating of food trucks.");
//		System.out.println("3. Display the highest- ranked food truck.");
//		System.out.println("4. Quit application.");
//		int menuChoice = kb.nextInt();
//	
//	if (menuChoice == 1) {
//		///list all food truck names here 
//	} 
//	if (menuChoice == 2) {
//		//list average rating here 
//		
//		if (menuChoice == 3) {
//			//display highest ranked food truck 
//		}
//		if (menuChoice == 4) {
//			//quit app 
//		}
//	}
