package com.polymorphism;

public class constructorTest {
	public constructorTest() {
		
	}
//	public constructorTest(String age) {
//		System.out.println(age);
//		
//	}
	public constructorTest(int age,String name) {
		System.out.println(age + name);
		
	}
	public static void main(String[] args) {
		
		constructorTest obj = new constructorTest(100 ,", Fatema"); 
	}


}
