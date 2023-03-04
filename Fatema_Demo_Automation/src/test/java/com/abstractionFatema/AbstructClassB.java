package com.abstractionFatema;

public class AbstructClassB extends AbstructClassA{

	@Override
	public void getToyota() {
		System.out.println("This is Toyota from class A.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getHonda() {
		System.out.println("This is Honda from class A.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getNissan() {
		System.out.println("This is Nissan from class A.");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		AbstructClassB obj = new AbstructClassB();
		obj.getHonda();
		obj.getNissan();
		obj.getToyota();
		obj.getBusiness();
		obj.getSalary();
		obj.getHouse();
	}

}
