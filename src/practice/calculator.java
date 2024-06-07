package practice;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.println("enter if u want to add,subtract,multiply or divide");
		Scanner sc= new Scanner(System.in);
		String a;
		a=sc.next();
		System.out.println("enter two number for "+a);
		int x,y,s;
		x=sc.nextInt();
		y=sc.nextInt();
		switch (a) {
		case ("add"):
		int i=add(x,y);
		System.out.println("the addition of "+x+" and "+y+" is "+i);
		break;
		case ("subtract"):
		int j=subtract(x,y);
		System.out.println("the subtraction of "+x+" and "+y+" is "+j);
		break;
		case ("multiply"):
		int k=multiply(x,y);
		System.out.println("the multiplication of "+x+" and "+y+" is "+k);
		break;
		case ("divide"):
		int l=divide(x,y);
		System.out.println("the division of "+x+" and "+y+" is "+l);
		break;
		default:
			System.out.println("invalid");
		}
	}
static int add(int a,int b) {
	int c;
	c=a+b;
	return c;
	
}
static int subtract(int a,int b) {
	int c;
	c=a-b;
	return c;
	
}
static int multiply(int a,int b) {
	int c;
	c=a*b;
	return c;
	
}
static int divide(int a,int b) {
	int c;
	c=a/b;
	return c;
	
}
}
