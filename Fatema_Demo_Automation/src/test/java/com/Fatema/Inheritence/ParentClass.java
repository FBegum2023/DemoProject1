package com.Fatema.Inheritence;

public class ParentClass {
	public void getCar() {
		System.out.println("This is a new car.");
	}
	protected void getInsurance() {
		System.out.println("The insurance is Geico.");
		
	}
	public static void main(String[] args) {
		
		ParentClass obj=new ParentClass();
		obj.getCar();
		obj.getInsurance();
			
		
	}

}
