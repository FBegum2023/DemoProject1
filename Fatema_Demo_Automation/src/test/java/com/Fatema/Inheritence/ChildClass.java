package com.Fatema.Inheritence;

public class ChildClass extends ParentClass {
	protected void getVehicle() {
		System.out.println("My favorite vehicle is BMW.");
	}
	protected int price() {
		int cost = 80000;
		System.out.println("The cost of the car is :$"+cost);
		return cost;
	}
	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		obj.getVehicle();
		obj.getCar();
		obj.getInsurance();
		obj.price();
	}
	protected int salary() {
		int cost = 80000;
		System.out.println("The cost of the car is :$"+cost);
		return cost;
	}
}
