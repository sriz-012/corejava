package object_method;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//	product p=new product();
//	p.setId(sc.nextInt());
//	p.setName(sc.next());
//	p.setPrice(sc.nextInt());
//	p.setCompany(sc.next());
//	test t=new test();
//	t.printproduct(p);
	
	}
	//object as parameter
   /*     void printproduct(product p) {
		System.out.println("Id="+p.getId());
		System.out.println("Name "+ p.getName());
		System.out.println("Price "+p.getPrice());
		System.out.println("Company "+p.getCompany());
	}*/
        
    //object as return type
        product getproductdata() {
        	product p=new product()
        	Scanner sc=new Scanner(System.in);
        	product p=new product();
        	p.setId(sc.nextInt());
        	p.setName(sc.next());
        	p.setPrice(sc.nextInt());
        	p.setCompany(sc.next());
        	return p;
        }
}
