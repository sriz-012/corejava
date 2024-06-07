package aggregation;

public class test {
public static void main(String[] args) {
	car c = new car();
	
	c.setColor("blue");
	c.setPrice(900000000);
	c.setCompamy("Buggati Chiron fourfiftykm per hour");
	employee emp = new employee();
	emp.setId(343);
	emp.setName("Gwach");
	emp.setSalary(513246);
	emp.setCar(c);
	
	System.out.println("Id =" +emp.getId());
	System.out.println("Name="+emp.getName());
	System.out.println("salary ="+emp.getSalary());
	System.out.println("--------car info-------");
	System.out.println("car color = "+c.getColor());
	
	
}
}
