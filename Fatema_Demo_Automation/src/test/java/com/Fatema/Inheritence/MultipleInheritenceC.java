package com.Fatema.Inheritence;

public class MultipleInheritenceC implements MultipleInheritenceClassA, MultipleInheritenceClassB{

	public void getSalary() {
		int salary=10000;
		System.out.println("My salary is $"+ salary);

	}

	public void getInfo() {
		System.out.println("I am learning Automation.");

	}
	public void getMedical() {
		System.out.println("I am eligible to get free medical.");

	}

	public void getTitle() {
		System.out.println("I am a Business Analyst.");

	}
	public static void main(String[] args) {
		MultipleInheritenceC obj = new MultipleInheritenceC();
		obj.getInfo();
		obj.getTitle();
		obj.getSalary();
		obj.getMedical();

	}

}
