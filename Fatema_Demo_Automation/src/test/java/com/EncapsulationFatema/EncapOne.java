package com.EncapsulationFatema;

public class EncapOne {
	//instance variable
	//use private access modifier
	private String name ="Fatema Begum.";
	private String designation = "QA Lead.";
	private int salary = 10000;
	//If you want no one to access those method, Make it private
	private String getName() {
		System.out.println("Employee name is "+name);
		return name;
	}
	private String getDesignation() {
		System.out.println("Employee designation is "+designation);
		return designation;
	}
	public int getSalary() {
		System.out.println("Employee salary is "+salary);
		return salary;
	}
	
	public static void main(String[] args) {
		EncapOne obj = new EncapOne();
		obj.getName();
		obj.getDesignation();
		obj.getSalary();
	}
	

}
