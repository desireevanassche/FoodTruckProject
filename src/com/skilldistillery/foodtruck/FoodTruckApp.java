package com.skilldistillery.foodtruck;

import java.util.*; //imports java utility including math random and scanner 

public class FoodTruckApp {

	static Scanner kb = new Scanner(System.in); // can the canner be static?

	public static void main(String[] args) {

		System.out.println("Welome to the international food truck cook off!");
		System.out.println();
		System.out.println("You can rate up to 5 food trucks.");
		System.out.println();
		System.out.println("If you don't feel like rating all 5, "
				+ "\n that's okay too, just type \"quit\" \nand we will take you to the main menu.");
		System.out.println("----------------------------------------------------------");

		FoodTruck[] foodTruckArr = new FoodTruck[5]; // Instantiated and array with 5 FoodTruck objects

		//boolean quit = false; if boolean is true break out of for loop - would not break out of loop at false 

		for (int i = 0; i < foodTruckArr.length; i++) { //iterate through the foodTruckArr array 

			System.out.println("Enter the name of the food truck you want to rate: ");
			String name = kb.nextLine(); //take user input for name 

			if (name.equals("quit")) { 
				break; // LL this worked better than a nested for loop 

			} else { 

				// foodTruckArr[i].setName(foodTruckName); // inital attempt to assign variable directly to array and set name
				// }

				System.out.println("What type of food is served at this food truck ?");
				String foodType = kb.nextLine();

				// foodTruckArr[i].setFoodType(kb.nextLine());

				System.out.println("Out of 5 stars, how would you rate this food truck?");
				double rating = kb.nextDouble();

				// foodTruckArr[i].setRating(kb.nextDouble());
				kb.nextLine();

				// foodTruckArr[i].setTruckId();
				
				foodTruckArr[i] = new FoodTruck(name, foodType, rating);  //constructor with field variabels ? 

			}
		}

		boolean menuLoop = true; // as long as true continue through loop 
		while (menuLoop) {
			
			System.out.println();
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
					System.out.println("Your 2021 Food Truck Contestants: ");
					System.out.println();

					for (int j = 0; j < foodTruckArr.length; j++) {
						if (foodTruckArr[j] == null) { //!= causes a null error and will not compile 
						break;
						}

						System.out.println(foodTruckArr[j].toString()); // utilize our toString from the FoodTruck class to display food truck data 
						System.out.println();

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
						sum += foodTruckArr[j].getRating(); // the sum increments adding in all the non null data in the array
						count++; //counter counts all non null values and increments with each loop 
					}
					average = sum / count;  
					System.out.println(average);
					break;

				case 3:

					int winCount = 0;
					double highest = foodTruckArr[0].getRating(); // HiLo start at the first food truck and iterate through all 

					System.out.println(".......................................................");
					System.out.println("..............    AND THE WINNER IS   ................. ");
					System.out.println();

					for (int j = 0; j < foodTruckArr.length; j++) { 
						if (foodTruckArr[j] != null) {
//							break;
							}

						if (foodTruckArr[j].getRating() > highest) { //if the next truck in the array is larger
							highest = foodTruckArr[j].getRating(); // it will be come the highest ranked truck
							winCount = j; // assigning j to a variable to use outside of the for loop 
						}
					}
					System.out.println(foodTruckArr[winCount].toString()); // announce winner 
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
	}
}
