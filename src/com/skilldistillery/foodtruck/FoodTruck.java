package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String name;
	private String foodType;
	private int uniqueId;
	private static int truckId = 1;
	private double rating;
	private double avgRating;

	public FoodTruck() { // no arg

	}

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.rating = rating;
		this.foodType = foodType;
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

	public double getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(double avgRating) {
		this.avgRating = avgRating;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId() {
		this.uniqueId = truckId; // removed ++ 
	}

	public String toString() {
		String output = "Name: " + name + " Food type: " + foodType + " Rating: " + rating + " Unique ID: " + uniqueId;
		return output;
	}

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

}
