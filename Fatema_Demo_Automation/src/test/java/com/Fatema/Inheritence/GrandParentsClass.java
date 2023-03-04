package com.Fatema.Inheritence;

public class GrandParentsClass extends ChildClass{
	void getRide() {
		System.out.println("I am going for shopping.");
	}
	protected void getGas() {
		System.out.println("I took gas from BP.");
	}
	
public static void main(String[] args) {
	GrandParentsClass obj = new GrandParentsClass();
	obj.getRide();
	obj.getGas();
	obj.getCar();
	obj.getInsurance();
	obj.getVehicle();
	
}
}
