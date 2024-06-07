package aggregation;

public class employee {

	private int id;
	private String name;
	private int salary;
	private car car; // has a relationship
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public car getCar() {
		return car;
	}
	public void setCar(car car) {
		this.car = car;
	}
	
}
