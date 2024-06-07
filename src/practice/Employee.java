package practice;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		 int a,b;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter salary");
			a=sc.nextInt();
			System.out.println("enter the num of hours work per day");
			b=sc.nextInt();
			getInfo(a,b);
			int c;
			c=addsal(a);
			System.out.println("you have been given a bonus now the currenty balance is "+c);
	}
	
 static void getInfo(int a,int b) {
	  System.out.println("salary is "+a+ " and number of work hours per day of employee is "+b ); 
	}
 static int addsal(int a) {
	 int s;
	 if(a<500)
	 {
		s= a+10;
		return s;
	 }
	 else
	 {
		 System.out.println("there is no bonus");
	 }
 }
}
