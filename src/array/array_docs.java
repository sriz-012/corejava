package array;

import java.util.Scanner;

public class array_docs {
	/*
	 *  data_type array_name[] = new data_type[size];
	 *  e.g 
	 *  int age[]=new int [500];
	 *  char aplha[]= new char[100];
	 *  string[] country= new string[128];
	 */
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		int age[]=new int[5];
		int i;
		for (i=0;i<age.length;i++)
		{
			
			age[i]=sc.nextInt();
		}
		int j=0;		
	    for( int x:age) { 
	    	j=x+j;
			System.out.println(j);
			*/
		int price[]=new int[10];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<price.length;i++) {
			price[i]=sc.nextInt();
			
		}
		int j=0;
		int avg;
		for(int x:price)
		{
			j=x+j;
		}
		avg=j/price.length;
		System.out.println(j+","+ avg);
	}

}
