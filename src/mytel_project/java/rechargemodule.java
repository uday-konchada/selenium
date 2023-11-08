package mytel_project.java;

import java.util.Scanner;

public class rechargemodule {
	public int recharge() {
		Scanner mobile =new Scanner (System.in);
		System.out.println("enter your mobile number:");
		long a1 =mobile.nextLong();
		System.out.println("packages:");
		System.out.println("package - 1:");
		System.out.println("amount=200");
		System.out.println("validity:30 days");
		System.out.println("data:3gb/day");
		System.out.println("package - 2:");
		System.out.println("amount=300");
		System.out.println("validity:30 days");
		System.out.println("data:6gb/day");
		System.out.println("enter the appropriate package number:");
		Scanner pack =new Scanner(System.in);
		int pack1=pack.nextInt();
		System.out.println("enter payment details: ");
		System.out.println("enter your credit/debit card number :");
		Scanner card=new Scanner(System.in);
		long card1=card.nextLong();
		System.out.println("enter expiry date: ");
		Scanner date=new Scanner(System.in);
		String date1=date.nextLine();
		System.out.println("enter cvv number");
		Scanner cvv=new Scanner(System.in);
		int cvv1=cvv.nextInt();
		System.out.println("congratulations!! your recharge is successful...");
		System.out.println("enter option 9 to go back to main options ");
		System.out.println("enter 0 to exit");
		Scanner option1= new Scanner(System.in);
		int options=option1.nextInt();
		if(options!=9&&options!=0) { 
			System.out.println("enter the correct option");
		}
		return options;
	}
}

