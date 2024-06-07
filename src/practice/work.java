package practice;

import java.util.Scanner;

public class work {
	public static void main(String[] args) {
		TypeOfTriangle();
	} 
	static void TypeOfTriangle() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a side of triangle");
		int a,b,c;
		a=sc.nextInt();
		System.out.println("enter another side of the triangle");
		b=sc.nextInt();
		System.out.println("enter the last side of traingle");
		c=sc.nextInt();
		if(a==b && a==c)
		{
			System.out.println("it is equilater triangle ");
			
		}
		else if (a==b || a==c || b==c)
		{
			System.out.println("is it isoscelos triangle");
		}
		else 
		{
			System.out.println("it is scalane triangle");
		}
		
	}


}
