package com.iprimed;
import java.util.Scanner;
enum Gender{
	MALE,FEMALE
}
public class Person {
private String firstname;
private String lastname;
private Gender gender;
public Person(String firstname, String lastname, Gender gender) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.gender = gender;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Gender getGender() {
	return gender;
}
public void setGender(Gender gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Person [firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender + "]";
}
public static void main(String[] args) {
	Person p1=new Person("James","J",Gender.MALE);
	System.out.println(p1);
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the firstname");
    String fname=scanner.next();
    System.out.println("Enter the lastname");
    String lname=scanner.next();
    System.out.println("Enter the gender");
    String gender=scanner.next();
    Gender genderE=Gender.valueOf(gender);
}
}




