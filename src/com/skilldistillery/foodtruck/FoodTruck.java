package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String name;
	private String foodType;
	private int uniqueId;
	private static int truckId = 1;
	private double rating;

	public FoodTruck() { // no arg

	}

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.rating = rating;
		this.foodType = foodType;
		this.uniqueId = truckId;
		truckId++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String toString() {
		String output = "Name: " + name + " Food type: " + foodType + " Rating: " + rating + " Truck ID: " + uniqueId;
		return output;
	}

}
