package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class ListInterfaceClass {
	public static void main(String[] args) {
		// how to declare array list
		//Arraylist is a class so we can create object
		//non genetic code version below 1.5
		//we have to use wrapper class Integer or String according to requirement.
		//We can't use both together
		
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("Fatema");
		
		ArrayList<String> list1=new ArrayList<String>();
		//list1.add(101);
		list1.add("GFJKF");
		
		ArrayList<String> list2=new ArrayList<String>(Arrays.asList("Fatema","Muntasir","Tanvir"));;
		System.out.println("Names are "+list2);
		//Declare LinkedList
		LinkedList<Integer>obj=new LinkedList<Integer>();
		//Declare Vector
		Vector<Integer> obj1=new Vector<Integer>();
		
	}

}
