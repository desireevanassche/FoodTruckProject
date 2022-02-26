package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		System.out.println("Welome to the international food truck cook off!");
		System.out.println("You can rate up to 5 food trucks.");

		FoodTruck[] foodTruckArr = new FoodTruck[5];
		for (int count = 1; count < foodTruckArr.length; count++) {
			System.out.println("Enter the name of the food truck you want to rate: ");
			String name = kb.nextLine();
			System.out.println("What type of food is served at " + name + " ?");
			String foodType = kb.nextLine();
			System.out.println("Out of 5 stars, how would you rate " + name + " ?");
			int rating = kb.nextInt();
			FoodTruck x = new FoodTruck(name, foodType, rating);

		}
	
		

//		FoodTruck truck1 = new FoodTruck();
//		foodTruckArr[0] = truck1;
//		truck1.setName(inTruck1);
//		truck1.setFoodType(inType);
//		truck1.setRating(inRate);
//
//		FoodTruck truck2 = new FoodTruck();
//		foodTruckArr[1] = truck2;
//		truck2.setName(inTruck1);
//		truck1.setFoodType(inType);
//		truck1.setRating(inRate);
//
//		FoodTruck truck1 = new FoodTruck();
//		foodTruckArr[0] = truck1;
//		truck1.setName(inTruck1);
//		truck1.setFoodType(inType);
//		truck1.setRating(inRate);
//
//		FoodTruck truck1 = new FoodTruck();
//		foodTruckArr[0] = truck1;
//		truck1.setName(inTruck1);
//		truck1.setFoodType(inType);
//		truck1.setRating(inRate);
//
//		FoodTruck truck1 = new FoodTruck();
//		foodTruckArr[0] = truck1;
//		truck1.setName(inTruck1);
//		truck1.setFoodType(inType);
//		truck1.setRating(inRate);

}
}
