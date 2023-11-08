package mytel_project.java;

import java.util.Scanner;

public class showbalance_module {
	public int showbalance() {
		System.out.println("enter your mobile number:");
		Scanner mobile3 =new Scanner (System.in);
		long a4 =mobile3.nextLong();
		System.out.println("balance:");
		System.out.println("sms:30;");
		System.out.println("talktime: unlimited");
		System.out.println("data:1 gb");
		System.out.println("enter option 9 to go back to main options: ");
		System.out.println("enter 0 to exit");
		Scanner option1=new Scanner(System.in);
		int options=option1.nextInt();
		if(options!=9&&options!=0) { 
			System.out.println("enter correct options");
		}
		return options;
			
	}
}
