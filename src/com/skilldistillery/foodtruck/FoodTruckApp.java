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

			foodTruckArr[i].setTruckId();
		
		}

		boolean menuLoop = true;
		while (menuLoop) {

			System.out.println("Please enter a number below to choose from the following menu: ");
			System.out.println("1. List all food trucks.");
			System.out.println("2. See Average rating of food trucks.");
			System.out.println("3. Display the highest- ranked food truck.");
			System.out.println("4. Quit application.");
			System.out.println();
			int menuChoice = kb.nextInt();

			if (menuChoice < 5) {

				switch (menuChoice) {

				case 1:
					System.out.println("Your 2021 Food Truck Contenstants: ");
					System.out.println();

					for (int j = 0; j < foodTruckArr.length; j++) {
						if (foodTruckArr[j] != null) {

						System.out.println(foodTruckArr[j].toString());
						System.out.println();
						}
					}
					break;

				case 2:

					double sum = 0;
					double average = 0;
					int count = 0;

					System.out.println("The average rating of all the contestants: ");

					for (int j = 0; j < foodTruckArr.length; j++) {
						if (foodTruckArr[j] == null) {
							break;
						}
						sum += foodTruckArr[j].getRating();
						count++;
					}
					average = sum / count;
					System.out.println(average);
					break;
					

				case 3:

					int winCount = 0;
					double highest = foodTruckArr[0].getRating(); // start at the first food truck

					System.out.println();
					System.out.println("............ AND THE WINNER IS..........: ");

					for (int j = 0; j < foodTruckArr.length; j++) {
						if (foodTruckArr[j] == null) {
							break;
						}

						if (foodTruckArr[j].getAvgRating() > highest) {
							highest = foodTruckArr[j].getRating();
							winCount = j;
						}
					}
					System.out.println(foodTruckArr[winCount].toString());
					break;

				case 4:
					
					System.out.println("Good Bye");
					menuLoop = false;
					break;

				default:
					System.out.println("Invalid entry please try again!");
					break;
				}
			}

		}

	kb.close();
}}
