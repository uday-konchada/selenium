package mytel_project.java;

import java.util.Scanner;

public class billpayment_module {
	public int bill() {
		System.out.println("enter your postpaid mobile number:");
		Scanner mobile1 =new Scanner (System.in);
		long a2 =mobile1.nextLong();
		System.out.println("the bill due amount is 600 INR.");
		System.out.println("enter payment details:");
		System.out.println("enter your credit/debit card number :");
		Scanner card2=new Scanner(System.in);
		long card3=card2.nextLong();
		System.out.println("enter expiry date: ");
		Scanner date2=new Scanner(System.in);
		String date3=date2.nextLine();
		System.out.println("enter cvv number");
		Scanner cvv2=new Scanner(System.in);
		int cvv3=cvv2.nextInt();
		System.out.println("congratulations!! your recharge is successful...");
		System.out.println("enter option 9 to go back to main options: ");
		System.out.println("enter 0 to exit");
		Scanner option1=new Scanner(System.in);
		int options=option1.nextInt();
		if(options!=9&&options!=0) { 
			System.out.println("enter correct option");
	
		}
		return options;
	}
	}


