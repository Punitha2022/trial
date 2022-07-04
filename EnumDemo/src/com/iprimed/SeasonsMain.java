package com.iprimed;

import java.util.Scanner;

public class SeasonsMain {
public static void main(String[] args) {
	System.out.println("Enter the season name ");
	Scanner scanner=new Scanner(System.in);
	String s=scanner.next();
	//Giving string as an input, it is returning Season value (Enum value)
	Season season=null;
	try {
	season=Season.valueOf(s.toUpperCase());
	}catch(IllegalArgumentException e) {
		System.out.println("Entered season is not present");
	}
	if(season!=null) {
	switch(season){
	case SUMMER: System.out.println("It is summer");
	             break;
	case WINTER: System.out.println("It is winter");
				 break;
	case RAINY:  System.out.println("It is rainly");
			     break;
	default : System.out.println("season not mentioned");
	}
	}
}
}
