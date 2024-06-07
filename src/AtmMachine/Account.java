package AtmMachine;

public class Account {
	
int account_num;
int pin=8989;
int balance;
int total_balance;

void StoreVal() {
	this.account_num=account_num;
	this.balance=balance;
	this.total_balance=total_balance;
	if(pin==8989 && account_num==1) {
		System.out.println("unlocked succesfully");
	}
	else
	{
		System.out.println("invalid pin");
	}
	Atm system=new Atm();
	system.input();
}
}
