package practice;

import java.util.Scanner;

public class pracice { 
	
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		switch(a) {
		case 1:
			System.out.println("the val is 1");
			break;
		case 2:
		System.out.println("the val is two");
		break;
		default:
			System.out.println("default");
			break;
		
		}
	}
}
