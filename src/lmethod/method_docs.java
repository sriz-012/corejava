package lmethod;

import java.util.Scanner;

public class method_docs {
	/*
	 * function 
	 * syntax
	 * return_type method_name (arg1,arg2,...){
	 * statements
	 * }
	 * 
	 * return types :
	 * a->void
	 * b->non-void
	 * method is writtern in class
	 */
	public static void main(String[] args) {
	int smallest=findthesmallest(2,3);
		System.out.println(smallest+"is greater");
	}
	/*static void area() {
		int a,b,c;
		System.out.println("enter length");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("enter breadth");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		c=a*b;
		System.out.println("the area of a rectangle is "+c);
	
	}*/
	
	
	
	
	
	/* static void printtable() {
	int i,j;
	System.out.println("enter a num of which table you want");
	Scanner f=new Scanner(System.in);
	i=f.nextInt();
	for(j=1;j<=12;j++) {
		int k;
	k=i*j;
	System.out.println(i+"*"+j+"="+k);
	}
	
	}
	*/
	static int findthesmallest(int a,int b) 
	{
	if(a<b)
	{
		return b;
	}
	else
	{
		return a;
	}
		
	}


}
