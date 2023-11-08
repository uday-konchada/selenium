package mytel_project.java;

import java.util.Scanner;

public class address_module {
	public int address() {
		System.out.println("enter your mobile number:");
		Scanner mobile4 =new Scanner (System.in);
		long a5 =mobile4.nextLong();
		System.out.println("name: konchada. uday kumar");
		System.out.println("address: sr.nagar, hyderabad");
		System.out.println("enter option 9 for main options ");
		System.out.println("enter option 0 to exit");
		Scanner option1=new Scanner(System.in);
		int options=option1.nextInt();
		if(options!=9&&options!=0) { 
			System.out.println("enter the correct option");
		}
		return options;
	}
}
