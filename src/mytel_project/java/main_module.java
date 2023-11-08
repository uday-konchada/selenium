package mytel_project.java;

import java.util.Scanner;

public class main_module {
	public int mytel() {
		System.out.println("welcome to Mytel: ");
		System.out.println("enter option 1 for mobile recharge");
		System.out.println("enter option 2 to pay your bills");
		System.out.println("enter option 3 to convert to postpaid/prepaid");
		System.out.println("enter option 4 to know the balance");
		System.out.println("enter option 5 for profile details");
		System.out.println("enter 0 to exit"); 
		System.out.println("enter your option: ");
		Scanner a=new Scanner(System.in);
		int option=a.nextInt();
		if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=0&&option!=9) {
			System.out.println("enter the correct options");
			return 9;
			
		}
		return option;
	}

}
