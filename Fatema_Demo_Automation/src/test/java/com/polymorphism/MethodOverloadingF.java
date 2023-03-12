package com.polymorphism;

public class MethodOverloadingF {
	// same method name but different parameters
	//changing datatype, location,situation
	public void employeeName(String name) {
		System.out.println("The employee name is "+name);
		
	}
	public void employeeName(String Desc, int salary) {
		System.out.println("The designation is "+Desc+" and employee salary is "+salary);

	}
	public void employeeName( double salary,String Address) {

   }
	public void employeeName( int age,String Address) {

	  }
	public void employeeName( double bonus) {

	  }
	public static void main(String[] args) {
		MethodOverloadingF obj = new MethodOverloadingF();	
		obj.employeeName("Fatema Begum");
		obj.employeeName("QA ", 8000);
	}
	

}


