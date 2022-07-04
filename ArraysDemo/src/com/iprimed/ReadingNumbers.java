package com.iprimed;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingNumbers {

	public static void main(String[] args) {
		int array[]=new int[5];
		getNumbers(array);
		System.out.println(Arrays.toString(array));
		int value=20;
		getNumber(value);
	}
 
	public static void getNumbers(int input[]) {//reference type - refers to the same memory location
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter "+ input.length +" numbers ");
		for (int i = 0; i < input.length; i++) {
			input[i]=scanner.nextInt();
		}
	}
	public static void getNumber(int i) {//value type - different memory location
		i=10;
	}
}
