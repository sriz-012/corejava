package AtmMachine;

import java.util.Scanner;

public class Atm{
	public static void main(String[] args) {
		input();
	}
static void input() {
	final Transactions t=new Transactions();
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter what you would like to perform");
	System.out.println("1. Balance inquiry");
	System.out.println("2. Withdrawal");
	System.out.println("3. Deposit");
	t.val=sc.next();
	switch (t.val){
		case "balance":
			t.Balance_inquiry();
			break;
		case "withdrawl":
			t.Withdrawl();
			break;
		case "deposit":
			t.Deposit();
			break;
		default:
			System.out.println("Please enter a valid choice ");
			input();
		    break;
	}
}
}
