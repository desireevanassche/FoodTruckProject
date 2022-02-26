package com.skilldistillery.foodtruck;

public class FoodTruck {
private String name; 
private String foodType;
private int uniqueId;
private double rating;

public FoodTruck(String name, String foodType, int rating) {
	// TODO Auto-generated constructor stub
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
public int getUniqueId() {
	return uniqueId;
}
public void setUniqueId(int uniqueId) {
	this.uniqueId = uniqueId;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}

}
