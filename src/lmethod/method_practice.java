package lmethod;

import java.util.Scanner;

public class method_practice {
/*public static void main(String[] args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	a=sc.nextInt();
	System.out.println("enter another value");
	b=sc.nextInt();
	c=getarea(a, b);
	System.out.println("the area of rectangle is "+c);
	
}
static int getarea(int a,int b) {
	int c;
	c=a*b;
	return c;
	
}*/
	/*public static void main(String[] args) {
		int l;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		volume(200,l);
		
	}
	static void volume(int a,int b) {
		System.out.println("area"+a);
		int c;
		c=b*b*b;
		System.out.println("volume ="+c);
		
	}
	*/
	public static void main(String[] args) {
		input();
		
	}
	static void input(){
		int p,t,r;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter ptr value");
		p=sc.nextInt();
		t=sc.nextInt();
		r=sc.nextInt();
		processing(p,t,r);
		
	}
	static void processing(int p,int t,int r){
		int si;
		si=(p*t*r)/100;
		int amt=p+si;
		output(si,amt);
		
	}
	static void output(int si,int amt){
		System.out.println("simple interest = "+ si +" and amount = "+amt);
		
	}
}
