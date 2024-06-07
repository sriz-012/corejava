package AtmMachine;

import java.util.Scanner;

public class Bank_Database {
	public static void main(String[] args) {
		setting_up();
	}
static void setting_up() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Are u already a member? login in if not please sign up");
	String a;
	a=sc.next();
	switch(a) {
	case "login":
	login();
	break;
	case "sign":
		System.out.println("this is not available currently please try again later");
		setting_up();
	default:
		System.out.println("invalid input");
		setting_up();
		break;
	}
}

 static void login() {
	//--------sign up-------
	Scanner sc=new Scanner(System.in);
	Account atm= new Account();
	System.out.println("Enter your account number");
	atm.account_num=sc.nextInt();
	System.out.println("Enter your pin");
	atm.pin=sc.nextInt();
	atm.balance=0;
	atm.total_balance=0;
	atm.StoreVal();
}
}
