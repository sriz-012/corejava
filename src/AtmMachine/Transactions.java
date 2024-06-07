package AtmMachine;

import java.util.Scanner;

public class Transactions {
	String val;
    static float balance;
    int Withdrawl_amt;
    int Deposit_amt;
public void Balance_inquiry() {
	System.out.println("Your current balance is"+balance);
	  Atm.input();
	}
public void Withdrawl() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the amount you want to withdraw");
	Withdrawl_amt=sc.nextInt();
	if(balance<=Withdrawl_amt) {
		balance = balance - Withdrawl_amt;
		System.out.println("Withdrawl succesful. Your current balance is"+balance);
	}
	else {
		System.out.println("insufficient balance");
	}
	  Atm.input();
}
public void Deposit() {
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter the amount you want to deposit");
    Deposit_amt=sc.nextInt();
    balance= balance+Deposit_amt;
    System.out.println("successfully deposited your current balance is "+balance);
    Atm.input();
}
public static void main(String[] args) {
	 Atm menu= new Atm();
}
}
