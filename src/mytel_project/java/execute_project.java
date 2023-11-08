package mytel_project.java;

import mytel_project.*;
public class execute_project {
	public static void main(String []args) {
		main_module mm=new main_module();
		int k=mm.mytel();
		while(k<=9)
		{
		switch(k)
		{
		case 1:
			System.out.println(" Mobile recharge module: ");
			rechargemodule bc=new rechargemodule();
			int ao=bc.recharge();
			k=ao;
			break;
		case 2:
			System.out.println("Bill pay module: ");
			billpayment_module bc1=new billpayment_module();
			int bo=bc1.bill();
			k=bo;
			break;
		case 3:
			System.out.println("Convertion module: ");
			conversion_module bc2=new conversion_module();
			int co=bc2.conversion();
			k=co;
			break;
		case 4:
			System.out.println("Balance module: ");
			showbalance_module bc3=new showbalance_module();
			int eo=bc3.showbalance();
			k=eo;
			break;
		case 5:
			System.out.println("Profile details module: ");
			address_module bc4=new address_module();
			int fo=bc4.address();
			k=fo;
			break;
		case 9:
			main_module bc5=new main_module();
			int ho=bc5.mytel();
			k=ho;
			break;
		case 0:
			System.out.println("thank you using the application");
			System.exit(0);
			break;
		}
		}
	}
}
