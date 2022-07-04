package com.iprimed;

import java.util.Arrays;

public class ValueAndReferenceType {
public static void main(String[] args) {
	int number=10;
	int anotherNumber=number;//1 value, anotherNumber has its own memory
	int arrNumber[]=new int[4];
	int anotherArrNumber[]=arrNumber;//2 - reference type ,
	//anotherArrNumber is referring to the same address as arrNumber
	System.out.println("Before update:value type");
	System.out.println("number = " +number);
	System.out.println("anotherNumber " + anotherNumber);
	anotherNumber++;
	System.out.println("After update :value type");
	System.out.println("number = " +number);
	System.out.println("anotherNumber " + anotherNumber);
	System.out.println("Before update : Reference type");
	System.out.println("arrNumber " + Arrays.toString(arrNumber));
	System.out.println("anotherArrNumber " + Arrays.toString(anotherArrNumber));
	anotherArrNumber[2]=90;
	arrNumber[1]=25;
	System.out.println("After update : reference type");
	System.out.println("arrNumber " + Arrays.toString(arrNumber));
	System.out.println("anotherArrNumber " + Arrays.toString(anotherArrNumber));
	
}
}
