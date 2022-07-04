package com.iprimed;

import java.util.Arrays;

public class ArrayOfNumbers {

	public static void main(String[] args) {
		//Declaration
		//int numbers[];
		
		//Allocating Space in the heap memory to store 5 integer values
		int numbers[]=new int[5];//index 0 to 4
		System.out.println(Arrays.toString(numbers));
		//create one double array, one string array, one boolean array
        
		double doubleNumbers[]=new double[4];
		System.out.println(Arrays.toString(doubleNumbers));
		
		String str[]=new String[4];
		System.out.println(Arrays.toString(str));
		
		boolean bool[]=new boolean[4];
		System.out.println(Arrays.toString(bool));
	

	}

}
