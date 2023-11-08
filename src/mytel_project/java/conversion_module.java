package mytel_project.java;

import java.util.Scanner;

public class conversion_module {
	public int conversion() {
		System.out.println("enter your mobile number:");
		Scanner mobile2 =new Scanner (System.in);
		long a3 =mobile2.nextLong();
		System.out.println("enter option 6 to convert from prepaid to postpaid");
		System.out.println("enter option 7 to convert from prepaid to postpaid");
	Scanner option2=new Scanner(System.in);
	int options1=option2.nextInt();
	if(options1==6){
	System.out.println("processing your request to convert from prepaid to postpaid");
	}
	else if(options1==7) {
	System.out.println("processing your request to convert from prepaid to postpaid");
	}
	System.out.println("congartulations!! your request is recieved. your new sim will be delivered in the next 2 days...");
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
		
