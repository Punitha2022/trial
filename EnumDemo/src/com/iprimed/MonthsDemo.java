package com.iprimed;

import java.util.Scanner;

enum Month{
	JAN(31),FEB(28),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),OCT(31),NOV(30),DEC(31);
	private final int noOfDays;
	
	Month(int noOfDays){
		this.noOfDays=noOfDays;
	}

	public int getNoOfDays() {
		return noOfDays;
	}	
	
}

public class MonthsDemo {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String month=scanner.next();
	Month mon=Month.valueOf(month.toUpperCase());
	System.out.println(mon.getNoOfDays());
}
}









