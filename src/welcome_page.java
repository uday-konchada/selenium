import java.util.*;
public class welcome_page {

	public static void main(String[] args) {
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
		if(option==1) {
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
			if(options==9) { 
				return;
		}
			else if(options==0) {
				System.out.println("thank you for  using the application");
			}
			}
		else if(option==2){
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
			if(options==9) { 
				return;
		}
			else if(options==0) {
				System.out.println("thank you for  using the application");
			}
		}
		else if(option==3) {
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
	if(options==9) { 
		return;
}
	else if(options==0) {
		System.out.println("thank you for  using the application");
	}
		}
		else if(option ==4) {
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
			if(options==9) { 
				return;
		}
			else if(options==0) {
				System.out.println("thank you for  using the application");
			}
		}
		else if (option==5) {
			System.out.println("enter your mobile number:");
			Scanner mobile4 =new Scanner (System.in);
			long a5 =mobile4.nextLong();
			System.out.println("name: konchada. uday kumar");
			System.out.println("address: sr.nagar, hyderabad");
			Scanner option1=new Scanner(System.in);
			int options=option1.nextInt();
			if(options==9) { 
				return;
		}
			else if(options==0) {
				System.out.println("thank you for  using the application");
			}
		}
		else if(option==0) {
			System.out.println("thank you for using the application");
		
		}
	}

	}
	
