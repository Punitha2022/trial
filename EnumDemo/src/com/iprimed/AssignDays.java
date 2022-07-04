package com.iprimed;

public class AssignDays {
public static void main(String[] args) {
	 Days myDays[]=Days.values();
	for(Days myday:myDays) {
		System.out.println(myday + " " + myday.ordinal() );
	}
	
	System.out.println(Days.valueOf("MONDAY"));
}
}
