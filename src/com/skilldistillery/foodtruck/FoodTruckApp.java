package com.skilldistillery.foodtruck;

import java.util.*;

public class FoodTruckApp {

	static Scanner kb = new Scanner(System.in); // can the canner be static?

	public static void main(String[] args) {

		System.out.println("Welome to the international food truck cook off!");
		System.out.println("You can rate up to 5 food trucks.");
		System.out.println("If you don't feel like rating all 5, "
				+ "\n that's okay too, just type \"quit\" \nand we will take you to the main menu.");
System.out.println("----------------------------------------------------------");
		FoodTruck[] foodTruckArr = new FoodTruck[5];
		boolean quit = false;

//		while (true) {
		for (int i = 0; i < foodTruckArr.length; i++) {

			foodTruckArr[i] = new FoodTruck();
			System.out.println("Enter the name of the food truck you want to rate: ");
			String foodTruckName = kb.nextLine();
			
			if (foodTruckName.equals("quit")) {
				break;
			} else {

				foodTruckArr[i].setName(foodTruckName);
			}

				System.out.println("What type of food is served at this food truck ?");
				foodTruckArr[i].setFoodType(kb.nextLine());

				System.out.println("Out of 5 stars, how would you rate this food truck?");
				foodTruckArr[i].setRating(kb.nextDouble());
				kb.nextLine();

			
			}
			FoodTruckApp menuLink = new FoodTruckApp();
			menuLink.menu(foodTruckArr);
		}
	

//	}

	static void menu(FoodTruck[] foodTruckArr) {
		System.out.println("Please enter a number below to choose from the following menu: ");
		System.out.println("1. List all food trucks.");
		System.out.println("2. See Average rating of food trucks.");
		System.out.println("3. Display the highest- ranked food truck.");
		System.out.println("4. Quit application.");
		int menuChoice = kb.nextInt();

		for (FoodTruck foodTruck : foodTruckArr) {

		}

//		if (menuChoice == 1) {
//			
//		}
//		if (menuChoice == 2) {
//			// list average rating here
//		}
//		if (menuChoice == 3) {
//			// display highest ranked food truck
//		}
//		if (menuChoice == 4) {
//			//quit app 
//		}
	}

}
