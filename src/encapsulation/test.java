package encapsulation;

public class test {
public static void main(String[] args) {
	Customer c= new Customer();
	c.setAge(19);
	c.setCity("ktm");
	c.setName("srijal");
	c.setPhone("0896876");
	System.out.println(c.getName());
	System.out.println(c.getAge());
	System.out.println(c.getPhone());
	System.out.println(c.getCity());
	// print all at once
	System.out.println(c);
}
}
