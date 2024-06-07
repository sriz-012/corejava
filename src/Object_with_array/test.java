package Object_with_array;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		student print[]=new student[5];
		for(int i=0;i<5;i++) {
			student s=new student();
			s.setFname(sc.next());
			s.setLname(sc.next());
			s.setAge(sc.nextInt());
			s.setId(sc.nextInt());
			s.setCity(sc.next());
			s.setCollege(sc.next());
			print[i]=s;
			
		}
		for(student s: print) {
			System.out.println(s);
		}
	}
}
