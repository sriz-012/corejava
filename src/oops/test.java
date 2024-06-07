package oops;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	//math book
	book b=new book();
	b.name="math";
	b.author="sriz";
	b.price=400;
	b.pages=100;
	b.PrintBookInfo();
	book eng=new book();
	System.out.println("enter name ,author,price,pages");
	Scanner sc=new Scanner(System.in);
	eng.name=sc.next();
	eng.author=sc.next();
	eng.price=sc.nextInt();
	eng.pages=sc.nextInt();
	eng.PrintBookInfo();
	
	
}
}
