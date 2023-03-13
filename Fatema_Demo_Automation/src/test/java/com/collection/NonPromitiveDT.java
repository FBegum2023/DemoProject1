package com.collection;

import java.util.Arrays;

public class NonPromitiveDT {
	public static void main(String[] args) {
		
		int[] num= new int[4];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;//out of boundary exception 
		          //because we declare 4 indexes and is is 5th
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
				
		
		//Primitive datatype cannot handle more than 1 value
		/*
		 * int a =20; a=30; a=40;
		 * 
		 * System.out.println(a); int b=20; int c=40;
		 */
		
		//How to declare Array.
		//Array is an object and a NP Datatype
		//[]=single dimentional array
		int number[]= {10,20,30,12,50,24};
		//How to declare multi dimrntionalArray.
		//printing the number of indexes
		System.out.println(Arrays.toString(number));
		for (int i=0; i<number.length;i++)
			System.out.println(i);
		//print the values of indexes
		//for (int i=0; i<number.length;i++)
		//	System.out.println(number[i]);
		
		
//		//Advanced loop
//		for(int num : number) {
//			System.out.println(num);
//		}
		//How to increment values
		// i++;
		  for(int i=0;i<=10;i++) {
			System.out.println("Incerement values "+i);
		  }
		//How to decrement values
		// i--;
			for(int i=10;i>=0;i--){
				System.out.println("Decrement values "+i);
		
			}		
		
		
		
		
		
		String name[][] = {{"Mohona","Muntasir","Rafiq","Shajib"},
							{"Tahiya", "Sunny","Lincoln","Fatema"},
							{"Touhid","Lopa","Farzana","Khatun"}};
	
	//System.out.println(number[3]);
	//System.out.println(name[2][1]);
	//System.out.println(Arrays.toString(number));
	}
}
	


