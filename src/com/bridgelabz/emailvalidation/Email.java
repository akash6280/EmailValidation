package com.bridgelabz.emailvalidation;
import java.util.regex.*;
import java.util.Scanner;
public class Email {
	static Scanner scanner=new Scanner(System.in);
	
	public static void emailValidator() {
		System.out.println("Enter email id");
		String emailId=scanner.nextLine();
		
		boolean result = Pattern.matches("^[a-zA-Z][a-zA-Z0-9]*[a-zA-Z0-9][[+-_.]]?[a-zA-Z]*@[a-zA-Z0-9]*[.][a-z]{2,4}", emailId);
		if(result) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		
		emailValidator();
		
	}
}
